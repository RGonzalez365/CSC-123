// Title: Lab 7b Q3
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/03/2023


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumericalCharacters {
    public static void main(String[] args) {
        String fileName = "example.txt";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isDigit(c)) {
                        count++;
                        if (count > 10) {
                            throw new TooManyNumbersException("Number of numerical characters exceeded limit!");
                        }
                    }
                }
            }
            System.out.println("Number of numerical characters: " + count);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (TooManyNumbersException e) {
            System.err.println(e.getMessage());
        }
    }
}
class TooManyNumbersException extends Exception {
    public TooManyNumbersException(String message) {
        super(message);
    }
}