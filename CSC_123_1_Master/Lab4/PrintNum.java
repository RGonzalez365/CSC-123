// Title: Lab 4
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number (-1 to exit): ");
            number = input.nextInt();
            if (number != -1) {
                System.out.println("You entered: " + number);
            }
        } while (number != -1);
    }
}
