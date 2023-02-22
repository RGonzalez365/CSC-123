// ***********************************************
// Raul E Gonzalez (rgonzalz365@toromail.csudh.edu
// Lab Assignemnt 3 question 2.a
// 02/10/2023
// ***********************************************

package labs;

import java.util.Scanner;
public class Lab_3a {
	
	// Method here asked the user for their name and returns it.
	static String nameMethod(String name) {
		Scanner nameInput = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String namee = nameInput.nextLine();
		name = namee;
		return name;
	}
	
	// Method here asked the user for their age and returns it.
	static int ageMethod(int age) {
		Scanner ageInput = new Scanner(System.in);
		System.out.print("\nPlease enter your age: ");
		int agee = ageInput.nextInt();
		age = agee;
		return age;
	}
	
	// Method here asked the user what school they attend and returns it.
	static String schoolMethod(String school) {
		Scanner schoolInput = new Scanner(System.in);
		System.out.print("\nWhere do you attend school: ");
		String schoool = schoolInput.nextLine();
		school = schoool;
		return school;
	}
	
	// Method here asked the user for an Int a and an Int b to multiply them.
	static double multiplyMethod(double a, double b) {
		Scanner intAInput = new Scanner(System.in);
		System.out.print("\nPlease enter int A: ");
		double a1 = intAInput.nextDouble();
		Scanner intBInput = new Scanner(System.in);
		System.out.print("Please enter int B: ");
		double b1 = intAInput.nextDouble();
		return a1 * b1;
	}
	
	// Method here asked the user for an Int c and an Int d to divide them.
	static double divideMethod(double c, double d) {
		Scanner intAInput = new Scanner(System.in);
		System.out.print("\nPlease enter int c: ");
		double c1 = intAInput.nextDouble();
		Scanner intBInput = new Scanner(System.in);
		System.out.print("Please enter int d: ");
		double d1 = intAInput.nextDouble();
		return c1 / d1;
	}
	
	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		int age = 0;
		String school = null;
		String name = null;
		//-------------Outputs
		System.out.println("Welcome " + nameMethod(name) + ", its very nice to meet you!");
		System.out.println("You are " + ageMethod(age) + " year(s) old.");
		System.out.println("You attend " + schoolMethod(school) + ", I heard that place is great!");
		System.out.println("double a * double b = " + multiplyMethod(a,b));
		System.out.println("double c / double d = " + divideMethod(c,d));
	}
}
