package by.tc.task01.factory;

import by.tc.task01.entity.*;
import by.tc.task01.parser.Parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop.*;
import static by.tc.task01.entity.criteria.SearchCriteria.Oven.POWER_CONSUMPTION;
import static by.tc.task01.entity.criteria.SearchCriteria.Oven.*;
import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.FREEZER_CAPACITY;
import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.OVERALL_CAPACITY;
import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.*;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC.COLOR;
import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY;
import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.*;

public class FactoryAppliance {
    private final Parser parser = new Parser();

    public List<Appliance> applianceList(HashMap<String, List<String>> applianceValue) {
        List<Appliance> applianceList = new ArrayList<>();
        for (String applianceName : applianceValue.keySet()) {

            switch (applianceName) {
                case "Oven":
                    List<String> valueOvens = applianceValue.get(applianceName);
                    for (String valueOven : valueOvens) {
                        HashMap<String, String> value = parser.getApplianceValue(valueOven);
                        Oven oven = buildOven(value);
                        applianceList.add(oven);
                    }
                    break;

                case "Refrigerator":
                    List<String> valueRefrigerators = applianceValue.get(applianceName);
                    for (String valueRefrigerator : valueRefrigerators) {
                        HashMap<String, String> value = parser.getApplianceValue(valueRefrigerator);
                        Refrigerator refrigerator = buildRefrigerator(value);
                        applianceList.add(refrigerator);
                    }
                    break;
                case "VacuumCleaner":
                    List<String> valueVacuumCleaners = applianceValue.get(applianceName);
                    for (String valueVacuumCleaner : valueVacuumCleaners) {
                        HashMap<String, String> value = parser.getApplianceValue(valueVacuumCleaner);
                        VacuumCleaner vacuumCleaner = buildVacuumCleaner(value);
                        applianceList.add(vacuumCleaner);
                    }
                    break;
                case "TabletPC":
                    List<String> valueTablePcs = applianceValue.get(applianceName);
                    for (String valueTablePc : valueTablePcs) {
                        HashMap<String, String> value = parser.getApplianceValue(valueTablePc);
                        TabletPC tabletPC = buildTablePc(value);
                        applianceList.add(tabletPC);
                    }
                    break;
                case "Laptop":
                    List<String> valueLaptops = applianceValue.get(applianceName);
                    for (String valueLaptop : valueLaptops) {
                        HashMap<String, String> value = parser.getApplianceValue(valueLaptop);
                        Laptop laptop = buildLaptop(value);
                        applianceList.add(laptop);
                    }
                    break;
                case "Speakers":
                    List<String> valueSpeakers = applianceValue.get(applianceName);
                    for (String valueSpeaker : valueSpeakers) {
                        HashMap<String, String> value = parser.getApplianceValue(valueSpeaker);
                        Speakers speakers = buildSpeakers(value);
                        applianceList.add(speakers);
                    }
                    break;
            }
        }
        return applianceList;
    }

    private Speakers buildSpeakers(HashMap<String, String> value) {
        return Speakers.builder()
                .powerConsumption(value.get(POWER_CONSUMPTION.name()))
                .numberOfSpeakers(value.get(NUMBER_OF_SPEAKERS.name()))
                .frequencyRange(value.get(FREQUENCY_RANGE.name()))
                .cordLength(value.get(CORD_LENGTH.name()))
                .build();
    }

    private Laptop buildLaptop(HashMap<String, String> value) {
        return Laptop.builder()
                .batteryCapacity(value.get(BATTERY_CAPACITY.name()))
                .os(value.get(OS.name()))
                .memoryRom(value.get(MEMORY_ROM.name()))
                .systemMemory(value.get(SYSTEM_MEMORY.name()))
                .cpu(value.get(CPU.name()))
                .displayInches(value.get(DISPLAY_INCHES.name()))
                .build();
    }

    private TabletPC buildTablePc(HashMap<String, String> value) {
        return TabletPC.builder()
                .batteryCapacity(value.get(BATTERY_CAPACITY.name()))
                .displayInches(value.get(DISPLAY_INCHES.name()))
                .memoryRom(value.get(MEMORY_ROM.name()))
                .flashMemory(value.get(FLASH_MEMORY_CAPACITY.name()))
                .color(value.get(COLOR.name()))
                .build();
    }

    private VacuumCleaner buildVacuumCleaner(HashMap<String, String> value) {
        return VacuumCleaner.builder()
                .power(value.get(POWER_CONSUMPTION.name()))
                .filterType(value.get(FILTER_TYPE.name()))
                .bagType(value.get(BAG_TYPE.name()))
                .wandType(value.get(WAND_TYPE.name()))
                .motorSpeedRegulation(value.get(MOTOR_SPEED_REGULATION.name()))
                .cleaningWidth(value.get(CLEANING_WIDTH.name()))
                .build();
    }

    private Oven buildOven(HashMap<String, String> value) {
        return Oven.builder()
                .power(value.get(POWER_CONSUMPTION.name()))
                .weight(value.get(WEIGHT.name()))
                .capacity(value.get(CAPACITY.name()))
                .depth(value.get(DEPTH.name()))
                .height(value.get(HEIGHT.name()))
                .width(value.get(WIDTH.name()))
                .build();
    }

    private Refrigerator buildRefrigerator(HashMap<String, String> value) {
        return Refrigerator.builder()
                .power(value.get(POWER_CONSUMPTION.name()))
                .weight(value.get(WEIGHT.name()))
                .fr_capacity(value.get(FREEZER_CAPACITY.name()))
                .overAllCapacity(value.get(OVERALL_CAPACITY.name()))
                .height(value.get(HEIGHT.name()))
                .width(value.get(WIDTH.name()))
                .build();
    }

}
