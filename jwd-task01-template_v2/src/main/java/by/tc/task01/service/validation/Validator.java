package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.util.Objects;

public class Validator {
	private static final String REGEXP_FOR_LINE_VALIDATION = " ";

	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		
		return true;
	}
	public boolean isEmpty(String line){
		return !Objects.equals(line, "");
	}
	public boolean isFileValid(String filepath) {
		if (filepath == null) {
			return false;
		}
		File file = new File(filepath);
		return file.exists() && (file.length() != 0);
	}
	public boolean isFileLineValid(String fileLine) {
		return fileLine.matches(REGEXP_FOR_LINE_VALIDATION);
	}
}

