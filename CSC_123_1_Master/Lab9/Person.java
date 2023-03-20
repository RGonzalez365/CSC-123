// Title: Lab 9
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/17/2023

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    public Person(String firstName, String lastName, String dateOfBirth) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        this.dateOfBirth = dateFormat.parse(dateOfBirth);
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    public int getAge() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(this.dateOfBirth);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    public static void main(String[] args) throws ParseException {
        Person person = new Person("John", "Doe", "01/20/1990");
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Age: " + person.getAge());
    }
}