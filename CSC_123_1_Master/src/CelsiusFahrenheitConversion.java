// Title: Lab 3 Q2
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/06/2023

import java.util.Scanner;

public class CelsiusFahrenheitConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitval = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equivalent to " + String.format("%.2f", fahrenheitval) + " Fahrenheit.");

        System.out.print("Enter a temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius2 = fahrenheitToCelsius(fahrenheit);
       
        System.out.println(fahrenheit + " Fahrenheit is equivalent to " + String.format("%.2f", celsius2)+ " Celsius.");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
