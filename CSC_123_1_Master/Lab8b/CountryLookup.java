// Title: Lab 8b Q1
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/10/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryLookup {

    public static void main(String[] args) {
        Map<String, String> countryMap = loadCountryData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search string: ");
        String searchString = scanner.nextLine().toLowerCase();
        String country = null;
        String population = null;
        for (String key : countryMap.keySet()) {
            if (key.toLowerCase().contains(searchString)) {
                country = key;
                population = countryMap.get(key);
                break;
            }
        }
        if (country != null) {
            System.out.println(country);
            System.out.println("Population: " + population);
        } else {
            System.out.println("Country not found.");
        }
    }
    private static Map<String, String> loadCountryData() {
        Map<String, String> countryMap = new HashMap<>();
        File countriesFile = new File("countries.txt");
        try (Scanner fileScanner = new Scanner(countriesFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] tokens = line.split(",");
                String country = tokens[0].trim();
                String population = tokens[1].trim();
                countryMap.put(country, population);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return countryMap;
    }
}