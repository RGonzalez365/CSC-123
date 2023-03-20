// Title: Lab 9
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/17/2023

import java.io.*;

public class PersonSerializationDemo {

    public static void main(String[] args) throws Exception {
        Person person1 = new Person("John", "Doe", "01/20/1990");
        Person person2 = new Person("Jane", "Doe", "03/14/1992");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persons.ser"));
        out.writeObject(person1);
        out.writeObject(person2);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("persons.ser"));
        Person p1 = (Person) in.readObject();
        Person p2 = (Person) in.readObject();
        in.close();
        System.out.println("Deserialized Person 1:");
        System.out.println("Full Name: " + p1.getFullName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Deserialized Person 2:");
        System.out.println("Full Name: " + p2.getFullName());
        System.out.println("Age: " + p2.getAge());
    }
}
