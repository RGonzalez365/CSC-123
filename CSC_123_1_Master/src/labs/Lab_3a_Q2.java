// ***********************************************
// Raul E Gonzalez (rgonzalz365@toromail.csudh.edu
// Lab Assignemnt 3 question 2.b
// 02/10/2023
// ***********************************************
package labs;

public class Lab_3a_Q2 {
	
	
	// 5 extremely simple string methods that called in the void main.
	
	static void myMethod (String firstName) {
		System.out.println(firstName + ", welcome to this lab assignemnt!");
	}
	static void myMethod2 (String food) {
		System.out.println(food + " is a favorite food of mine!");
	}
	static void myMethod3 (String car) {
		System.out.println("I drive a black " + car);
	}
	static void myMethod4 (String age) {
		System.out.println("I am " + age + " years old!");
	}
	static void myMethod5 (String hobby) {
		System.out.println("I enjoy playing " + hobby + " as a hobby");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod("Raul");
		myMethod2("pizza");
		myMethod3("Toyota");
		myMethod4("25");
		myMethod5("Magic the gathering");
	}

}
