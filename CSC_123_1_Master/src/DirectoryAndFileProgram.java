// Title: Lab 7b Q1
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023

import java.io.File;
import java.io.IOException;

public class DirectoryAndFileProgram {
    public static void main(String[] args) {
        String filePath = "C:\\lab6b\\challenge1\\subfolder\\test.txt";
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred while creating directories and file: " + e.getMessage());
            return;
        }
        try {
            File file = new File(filePath);
            boolean success = file.setReadable(true, false);
            if (!success) {
                System.out.println("Failed to set file permissions");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while setting file permissions: " + e.getMessage());
        }
    }
}
