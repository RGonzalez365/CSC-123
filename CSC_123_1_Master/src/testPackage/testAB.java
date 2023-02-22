package testPackage;

public class testAB {

	public static void main(String[] args) {

		//System.out.println(new classB().fieldA);
		Vehicle myVehicle = new Vehicle("My Vehicle");
		
		System.out.println(myVehicle.getName());
		myVehicle.start();
		System.out.println(myVehicle.isRunning());
		
		Car2 myCar = new Car2("\nTesla 3");
		
		System.out.println(myCar.getName());
		myCar.start();
		System.out.println(myCar.isRunning());
	}
}
