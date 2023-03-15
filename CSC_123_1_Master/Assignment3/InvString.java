// Title: Assignment 03
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class InvString {
    private String str;
    public InvString(String str) {
        this.str = str;
    }
    public String toString() {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        InvString s = new InvString("This is a test");
        System.out.println(s);
    }   
}