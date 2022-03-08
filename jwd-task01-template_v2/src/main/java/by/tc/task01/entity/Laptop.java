package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Laptop extends Appliance {
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInches;

    public String toString() {
        return "Laptop : BATTERY_CAPACITY=" + this.getBatteryCapacity() + ", OS=" + this.getOs() + ", MEMORY_ROM=" + this.getMemoryRom() + ", SYSTEM_MEMORY=" + this.getSystemMemory() + ", CPU=" + this.getCpu() + ", DISPLAY_INCHES=" + this.getDisplayInches() + ",";
    }
}
