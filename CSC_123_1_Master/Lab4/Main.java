// Title: Lab 4
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class Main {
    public static void main(String[] args) {
        int x = 130;        
        byte y = (byte) x;
        System.out.println("The value of y is: " + y);
        x = 126;
        y = (byte) x;
        System.out.println("The value of y is: " + y); 
        x = 130;
        y = (byte) x;
        System.out.println("The value of y is: " + y); // Output: -126
    }
}