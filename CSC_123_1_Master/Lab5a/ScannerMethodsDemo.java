// Title: Lab 5a
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.util.Scanner;

public class ScannerMethodsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        System.out.print("Enter a sentence: ");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);
        System.out.print("Enter two comma-separated values: ");
        String values = scanner.nextLine();
        String[] parts = values.split(",");
        int first = Integer.parseInt(parts[0].trim());
        int second = Integer.parseInt(parts[1].trim());
        System.out.println("You entered: " + first + " and " + second);
        System.out.print("Enter a float: ");
        float text = scanner.nextFloat();
        System.out.println("You entered: " + text);
        boolean has=scanner.hasNext();     
        System.out.println("Has more input? " + has);       
        scanner.close();
    }
}
