package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class VacuumCleaner extends Appliance {
    private String power;
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    public String toString() {
        return "VacuumCleaner : (POWER_CONSUMPTION=" + this.getPower() + ", FILTER_TYPE=" + this.getFilterType() + ", BAG_TYPE=" + this.getBagType() + ", WAND_TYPE=" + this.getWandType() + ", MOTOR_SPEED_REGULATION=" + this.getMotorSpeedRegulation() + ", CLEANING_WIDTH=" + this.getCleaningWidth() + ",";
    }
}
