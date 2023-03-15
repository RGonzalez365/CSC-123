// Title: Lab 8b Q1
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/10/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the source file: ");
        String sourceFileName = scanner.nextLine();
        File sourceFile = new File(sourceFileName);
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist!");
            return;
        }
        System.out.print("Enter the name of the target file: ");
        String targetFileName = scanner.nextLine();
        File targetFile = new File(targetFileName);
        if (targetFile.exists()) {
            System.out.println("Target file already exists!");
            return;
        }
        try (Scanner sourceScanner = new Scanner(sourceFile);
             PrintWriter targetWriter = new PrintWriter(targetFile)) {
            while (sourceScanner.hasNextLine()) {
                targetWriter.println(sourceScanner.nextLine());
            }
            System.out.println("File copy successful!");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
