package by.tc.task01.statement;

import by.tc.task01.entity.Appliance;
import by.tc.task01.exception.ApplianceException;
import by.tc.task01.factory.FactoryAppliance;
import by.tc.task01.parser.Parser;
import by.tc.task01.reader.ReaderFile;

import java.util.HashMap;
import java.util.List;

public class StatementAppliance {
    private final ReaderFile readerFile = new ReaderFile();
    private final List<String> list = readerFile.receiveValidApplianceLines("C:\\Users\\User\\IdeaProjects\\jwd-task01-template_v2\\jwd-task01-template_v2\\src\\main\\resources\\appliances_db.txt"); //TODO CHANGE ON RELATIVE PATH
    private final Parser parser = new Parser();
    private final HashMap<String, List<String>> mapValue = parser.getMapValue(list);
    private final FactoryAppliance factoryAppliance = new FactoryAppliance();
    private final List<Appliance> appliances = factoryAppliance.applianceList(mapValue);

    public StatementAppliance() throws ApplianceException {
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }
}
