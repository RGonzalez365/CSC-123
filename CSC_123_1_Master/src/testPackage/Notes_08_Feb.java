package testPackage;

public class Notes_08_Feb {

	public static void main(String[] args) {

		//String s1 = new String("Hello World!");
		//MyString s = new MyString("Test string");
		//System.out.println(s.convertToUpperCase());
		//System.out.println(s.myString);
		
		Car myToyota = new Car("Black", 2023, 2, "Toyota");
		//myToyota.engineState = true; // it is now private which means we can not access it here unless it becomes public again.
		
		myToyota.changeGear('P');
		myToyota.start();
		
		System.out.println(myToyota);
				
	}
}
