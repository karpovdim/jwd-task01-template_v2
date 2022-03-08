package by.tc.task01.exception;

import java.io.IOException;

public class ApplianceException extends Exception {
    public ApplianceException(String msg, IOException e) {
super(msg,e);
    }

    public ApplianceException(String invalid_file_path) {
    }
}
