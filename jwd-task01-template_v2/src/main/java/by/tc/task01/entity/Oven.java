package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Oven extends Appliance {
    private String power;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String width;

    public String toString() {
        return "Oven : POWER_CONSUMPTION=" + this.getPower() + ", WEIGHT=" + this.getWeight() + ", CAPACITY=" + this.getCapacity() + ", DEPTH=" + this.getDepth() + ", HEIGHT=" + this.getHeight() + ", WIDTH=" + this.getWidth() + ",";
    }
}
