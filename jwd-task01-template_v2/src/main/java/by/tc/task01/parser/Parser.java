package by.tc.task01.parser;

import java.util.*;

public class Parser {

    private static final String REGEX_1 = ":";
    private static final String REGEX_2 = ",";
    private static final String REGEX_3 = "=";

    public HashMap<String, List<String>> getMapValue(final List<String> linesValue) {
        HashMap<String, List<String>> outerMap = new HashMap<>();
        for (String lineValue : linesValue) {
            String[] split = lineValue.split(REGEX_1);
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            if (!outerMap.containsKey(split[0])) {
                outerMap.put(split[0], new ArrayList<>());
            }
            outerMap.get(split[0]).add(split[1]);
        }
        return outerMap;
    }

    public HashMap<String, String> getApplianceValue(String valueOvens) {
        final HashMap<String, String> applianceValue = new HashMap<>();
        final String[] splitLine = valueOvens.split(REGEX_2);
        for (String s : splitLine) {
            final String[] split = s.split(REGEX_3);
            applianceValue.put(split[0].trim(), split[1]);
        }
        return applianceValue;
    }
}
