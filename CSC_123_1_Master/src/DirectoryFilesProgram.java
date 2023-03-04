// Title: Lab 7b Q2
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023

import java.io.File;

public class DirectoryFilesProgram {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a directory path as input");
            return;
        }
        String dirPath = args[0];
        File dir = new File(dirPath);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("The specified input is not a directory or does not exist");
            return;
        }
        File[] files = dir.listFiles();
        int count = 0;
        for (File file : files) {
            count++;
            String fileInfo = count + " - " + file.getName();
            if (file.isDirectory()) {
                fileInfo += " (directory)";
            } else {
                fileInfo += " (file)";
            }
            if (file.canRead()) {
                fileInfo += ", readable";
            } else {
                fileInfo += ", not-readable";
            }
            if (file.canWrite()) {
                fileInfo += ", writable";
            } else {
                fileInfo += ", not-writable";
            }
            if (file.canExecute()) {
                fileInfo += ", executable";
            } else {
                fileInfo += ", not-executable";
            }
            System.out.println(fileInfo);
        }
        System.out.println("Total files: " + count);
    }
}
