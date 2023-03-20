// Title: Lab 9
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/17/2023

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInverter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String[] lines = reader.lines().toArray(String[]::new);
            for (int i = lines.length - 1; i >= 0; i--) {
                writer.write(lines[i]);
                writer.newLine();
            }
            reader.close();
            writer.close();
            
            System.out.println("File inverted successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
