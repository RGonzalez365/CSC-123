// Title: Assignment 05
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide two arguments - source file and target file.");
            return;
        } 
        String sourceFile = args[0];
        String targetFile = args[1];
        File source = new File(sourceFile);
        File target = new File(targetFile);
        if (!source.exists()) {
            System.out.println("Error: Source file does not exist.");
            return;
        }
        if (source.isDirectory()) {
            System.out.println("Error: Source file is a directory.");
            return;
        }
        if (target.isDirectory()) {
            System.out.println("Error: Target file is a directory.");
            return;
        }        
        if (target.exists()) {
            System.out.println("Error: Target file already exists.");
            return;
        }
        try {
            target.getParentFile().mkdirs();            
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            int totalBytes = 0;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
                totalBytes += length;
            }
            in.close();
            out.close();            
            System.out.println(totalBytes + " bytes successfully copied from " + sourceFile + " to " + targetFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
