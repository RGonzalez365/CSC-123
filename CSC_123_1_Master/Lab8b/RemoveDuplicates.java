// Title: Lab 8b Q2
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/10/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Enter output file name: ");
        String outputFileName = scanner.nextLine();
        Set<String> lines = new LinkedHashSet<>();
        try (Scanner fileScanner = new Scanner(new File(inputFileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines.add(line.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }
        System.out.println("Duplicates removed and output saved to " + outputFileName);
    }
}
