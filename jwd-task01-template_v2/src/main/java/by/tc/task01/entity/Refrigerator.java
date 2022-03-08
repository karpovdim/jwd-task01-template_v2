package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Refrigerator extends Appliance {
    private String power;
    private String weight;
    private String fr_capacity;
    private String overAllCapacity;
    private String height;
    private String width;

    public String toString() {
        return "Refrigerator : (POWER_CONSUMPTION=" + this.getPower() + ", WEIGHT=" + this.getWeight() + ", FREEZER_CAPACITY=" + this.getFr_capacity() + ", OVERALL_CAPACITY=" + this.getOverAllCapacity() + ", HEIGHT=" + this.getHeight() + ", WIDTH=" + this.getWidth() + ",";
    }
}
