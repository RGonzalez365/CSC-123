// Title: Lab 4
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}