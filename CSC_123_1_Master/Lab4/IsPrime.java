// Title: Lab 4
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class IsPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }   
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }  
}
