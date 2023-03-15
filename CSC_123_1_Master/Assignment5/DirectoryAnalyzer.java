// Title: Assignment 05
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DirectoryAnalyzer {
    private static final int KB = 1024;
    private static final int MB = KB * 1024;
    private static final int GB = MB * 1024;
    private static boolean isDirectory(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }
    private static long getDirectorySize(File directory) {
        long size = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                size += file.length();
            } else if (file.isDirectory()) {
                size += getDirectorySize(file);
            }
        }
        return size;
    }
    private static void analyzeDirectory(String path) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Error: Directory does not exist.");
            return;
        } else if (!dir.canRead()) {
            System.out.println("Error: Directory is not readable.");
            return;
        } else if (!dir.isDirectory()) {
            System.out.println("Error: Path is not a directory.");
            return;
        }
        int fileCount = 0;
        int totalAlphaChars = 0;
        int totalNumericChars = 0;
        int totalSpaceChars = 0;
        long totalSize = 0;
        StringBuilder outputTable = new StringBuilder();
        outputTable.append(String.format("%-20s %-15s %-15s %-15s%n", "File Name", "Size", "Alpha Chars", "Numeric Chars", "Spaces"));
        for (File file : dir.listFiles()) {
            if (file.isFile()) {
                int alphaChars = 0;
                int numericChars = 0;
                int spaceChars = 0;
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        for (char c : line.toCharArray()) {
                            if (Character.isAlphabetic(c)) {
                                alphaChars++;
                            } else if (Character.isDigit(c)) {
                                numericChars++;
                            } else if (Character.isWhitespace(c)) {
                                spaceChars++;
                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("Error: File not found.");
                    continue;
                }
                fileCount++;
                totalAlphaChars += alphaChars;
                totalNumericChars += numericChars;
                totalSpaceChars += spaceChars;
                long fileSize = file.length();
                totalSize += fileSize;
                outputTable.append(String.format("%-20s %-15d %-15d %-15d %-15d%n", file.getName(), fileSize, alphaChars, numericChars, spaceChars));
            }
        }
        System.out.println(outputTable.toString());
        String totalSizeString;
        if (totalSize < 1024) {
            totalSizeString = totalSize + " bytes";
        } else if (totalSize < 1024 * 1024) {
            totalSizeString = String.format("%.2f KB", totalSize / 1024.0);
        } else if (totalSize < 1024 * 1024 * 1024) {
            totalSizeString = String.format("%.2f MB", totalSize / (1024.0 * 1024));
        } else {
            totalSizeString = String.format("%.2f GB", totalSize / (1024.0 * 1024 * 1024));
        }
        System.out.println("Total Files: " + fileCount);
        System.out.println("Total Alpha Chars: " + totalAlphaChars);
        System.out.println("Total Numeric Chars: " + totalNumericChars);
        System.out.println("Total Space Chars: " + totalSpaceChars);
        System.out.println("Total Size Disk: " + totalSizeString);
        }
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java DirectoryAnalyzer directoryName");
            return;
        }
        String path = args[0];
        if (!isDirectory(path)) {
            System.out.println("Error: Path is not a directory.");
            return;
        }
        analyzeDirectory(path);
    }
}