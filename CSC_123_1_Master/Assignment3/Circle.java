// Title: Assignment 03
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class Circle {
    private String label;
    private double radius;
    public Circle(String label, double radius) {
        this.label = label;
        this.radius = radius;
    }
    public String toString() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        return label + "\nRadius: " + radius + "\nArea: " + area + "\nCircumference: " + circumference;
    }
    public static void main(String[] args) {
        Circle c = new Circle("My Circle", 20);
        System.out.println(c);
    }
}