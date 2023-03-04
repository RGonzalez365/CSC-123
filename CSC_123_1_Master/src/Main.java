// Title: Lab 7a Q1
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023

public class Main{
    public static void main(String[] args) {
        for (int x = 0; x < 9; x++) {
            try {
                System.out.println(x / (x % 2));
            } 
            catch (ArithmeticException e) {
            }
        }
    }
}