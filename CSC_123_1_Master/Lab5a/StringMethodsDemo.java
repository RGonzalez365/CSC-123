// Title: Lab 5a
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023


public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "hello, world!";
        System.out.println("Length of string: " + str.length());
        System.out.println("Character at index 4: " + str.charAt(4));
        System.out.println("Substring from index 7 to end: " + str.substring(7));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Index of 'world': " + str.indexOf("world"));
        System.out.println("Uppercase string: " + str.toUpperCase());
    }
}
