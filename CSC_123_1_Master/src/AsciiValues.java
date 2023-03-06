// Title: Lab 3 Q3
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/06/2023

import java.util.Scanner;

public class AsciiValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 characters:");

        for (int i = 0; i < 5; i++) {
            char c = scanner.next().charAt(0);
            System.out.println("ASCII value of " + c + ": " + (int) c);
        }
    }
}
