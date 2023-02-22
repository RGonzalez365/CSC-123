package testPackage;

public class Vehicle {
	//public String fieldA = "Field A";
	//public String fieldB = "Field B";
	
	private boolean running;
	private String name;
	
	public Vehicle(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
	}
	public void start() {
		System.out.println("Steam powered... ");
		this.running = true;
	}
	public boolean isRunning() {
		return this.running;
	}
	
}
