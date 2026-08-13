package org.ibm.oops;

public class Robot {
    private int batteryLevel;

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if(batteryLevel < 0 || batteryLevel > 100) {
            throw new IllegalArgumentException("Battery level must be between 0 and 100.");
        }
        this.batteryLevel = batteryLevel;
    }

    public void performTask(String task) {
        if(batteryLevel <= 0) {
            System.out.println("Battery is empty. Please recharge.");
            return;
        }
        System.out.println("Performing task: " + task);
        batteryLevel -= 10; // Assume each task consumes 10% battery
    }
}
