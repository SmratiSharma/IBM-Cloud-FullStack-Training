package org.ibm.oops;


public class JavaDemoApplication {

	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.batteryLevel = 100;
		System.out.println("Battery Level: " + robot.batteryLevel);
	}

}
