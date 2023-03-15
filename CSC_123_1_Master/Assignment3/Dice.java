// Title: Assignment 03
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.util.Random;

public class Dice {
    private int value;
    private Random rand;
    public Dice() {
        rand = new Random();
    }
    public void cast() {
        value = rand.nextInt(6) + 1;
    }
    public String toString() {
        return "The value is: " + value;
    }
    public static void main(String[] args) {
        Dice d = new Dice();
        d.cast();
        System.out.println(d);
    }
}