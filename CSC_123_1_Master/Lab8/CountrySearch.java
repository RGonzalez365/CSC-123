// Title: Lab 8b Q2
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/10/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountrySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the search string from the user
        System.out.print("Enter search string: ");
        String searchString = scanner.nextLine().toLowerCase();

        // Open the countries file for reading
        File countriesFile = new File("countries.txt");
        try (Scanner fileScanner = new Scanner(countriesFile)) {

            System.out.println("The countries matching your input \"" + searchString + "\" are:");

            // Read each line of the file and check if it matches the search string
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split(",");
                String country = tokens[0].trim();
                String population = tokens[1].trim();
                if (country.toLowerCase().contains(searchString)) {
                    System.out.println(country + " - Population: " + population);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
