// Title: Lab 8b Q3
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/10/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortLines {
    public static void main(String[] args) {
         Scanner scann = new Scanner(System.in);
         System.out.print("Enter input file name: ");
         String inputFile= scann.nextLine();
         System.out.print("Enter output file name: ");
         String outputFile = scann.nextLine();
         ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Input file not found: " + inputFile);
            System.exit(1);
        }
        Collections.sort(lines, String.CASE_INSENSITIVE_ORDER);
        try (PrintWriter writer = new PrintWriter(new File(outputFile))) {
            for (String line : lines) {
                writer.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Output file not found: " + outputFile);
            System.exit(1);
        }
        System.out.println("Lines sorted and written to " + outputFile);
    }
}