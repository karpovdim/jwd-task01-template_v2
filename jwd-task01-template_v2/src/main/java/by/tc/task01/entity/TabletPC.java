package by.tc.task01.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TabletPC extends Appliance {
    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;
    private String flashMemory;
    private String color;

    public String toString() {
        return "TabletPC : (BATTERY_CAPACITY=" + this.getBatteryCapacity() + ", DISPLAY_INCHES=" + this.getDisplayInches() + ", MEMORY_ROM=" + this.getMemoryRom() + ", FLASH_MEMORY_CAPACITY=" + this.getFlashMemory() + ", COLOR=" + this.getColor() + ",";
    }
}
