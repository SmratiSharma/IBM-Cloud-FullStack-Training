package org.ibm.oops;


public class JavaDemoApplication {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.setBatteryLevel(100);
		System.out.println("Battery Level: " + robot.getBatteryLevel());
		robot.performTask("Clean the room");
		System.out.println("Battery Level after task: " + robot.getBatteryLevel());
	}

}
