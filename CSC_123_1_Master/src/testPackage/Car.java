package testPackage;

public class Car {
	private String color;
	private int year;
	private int doors;
	private boolean engineState; // On || Off
	private String make;
	private char gear; // 'D' 'N' 'R' 'P'
	private boolean ignitionState; // On || Off
	private boolean headLampState; // On || Off

	// Constructor Method created from 'Right Click > Source > Generate Constructor using Fields'
	public Car(String color, int year, int doors, String make) {
		super();
		this.color = color;
		this.year = year;
		this.doors = doors;
		this.make = make;
		this.gear = 'N';
	}
	
	public boolean start() {
		if (gear == 'P') {
			engineState = true;
		}
		return engineState;
	}
	
	public void changeGear(char g) {
		gear = g;
	}
	
	
	public String toString() {
		String s = "Make = " + make + "\n" + "Started = " + engineState + "\n" + "Gear = " + gear;
		return s;
	}
	
}
