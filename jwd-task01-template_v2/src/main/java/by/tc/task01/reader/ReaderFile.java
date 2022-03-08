package by.tc.task01.reader;

import by.tc.task01.exception.ApplianceException;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReaderFile {

    public List<String> receiveValidApplianceLines(String filepath) throws ApplianceException {
        Validator validator = new Validator();
        if (!validator.isFileValid(filepath)) {
            throw new ApplianceException("Invalid file path");
        }
        Path path = Paths.get(filepath);
        List<String> fileLines;
        try (Stream<String> fileLinesStream = Files.lines(path)) {
            fileLines = fileLinesStream
                  //  .filter(validator::isFileLineValid) TODO CREATE REGEXP IN TO VALIDATOR
                    .filter(validator::isEmpty)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new ApplianceException("Error while reading file: " + filepath, e);
        }
        return fileLines;
    }
}
