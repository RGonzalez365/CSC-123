// Title: Lab 7a Q2
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        float b;
        try {
            System.out.print("Enter an integer a: ");
            a = scanner.nextInt();
            System.out.print("Enter a non-zero float b: ");
            b = scanner.nextFloat();
            if (b == 0) {
                throw new IllegalArgumentException("b cannot be zero");
            }
        } 
        catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        }
        try {
            float result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
