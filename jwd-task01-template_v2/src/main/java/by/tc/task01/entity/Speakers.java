package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Speakers extends Appliance {
    private String powerConsumption;
    private String numberOfSpeakers;
    private String frequencyRange;
    private String cordLength;

    public String toString() {
        return "Speakers : (POWER_CONSUMPTION=" + this.getPowerConsumption() + ", NUMBER_OF_SPEAKERS=" + this.getNumberOfSpeakers() + ", FREQUENCY_RANGE=" + this.getFrequencyRange() + ", CORD_LENGTH=" + this.getCordLength() + ",";
    }
}
