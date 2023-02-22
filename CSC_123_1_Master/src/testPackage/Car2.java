package testPackage;

public class Car2 extends Vehicle{
	
	// Constructor
	public Car2(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Electric Powered");
	}
}
