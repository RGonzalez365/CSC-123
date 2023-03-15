// Title: Assignment 03
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.util.ArrayList;
import java.util.Scanner;
public class UserManager {
    private ArrayList<User> users;
    private Scanner scanner;
    public UserManager() {
        users = new ArrayList<User>();
        scanner = new Scanner(System.in);
    }
    public void run() {
        int choice = 0;
        while (choice != 3) {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    listUsers();
                    break;
                case 3:
                    System.out.println("Thank you for using User Manager, Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        }
    }
    private void printMenu() {
        System.out.println("1 - Register User");
        System.out.println("2 - List Users");
        System.out.println("3 - Exit");
        System.out.println("Please enter your choice:");
    }
    private void registerUser() {
        System.out.println("Enter the first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the email address:");
        String email = scanner.nextLine();
        User user = new User(firstName, lastName, email);
        users.add(user);
        System.out.printf("Thank you, user %s has been registered.%n", user.toString1());
    }
    private void listUsers() {
        int totalUsers = users.size();
        for (int i = 0; i < totalUsers; i++) {
            User user = users.get(i);
            System.out.printf("%d - %s%n", i + 1, user.toString2());
        }
        System.out.printf("Total users: %d%n", totalUsers);
    }
    public static void main(String[] args) {
        UserManager manager = new UserManager();
        manager.run();
    }
}
class User {
    private String firstName;
    private String lastName;
    private String email;
    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String toString1() {
        return firstName + " " + lastName + " (" + email + ")";
    }
    public String toString2() {
        return lastName + " , " + firstName + " (" + email + ")";
    }
}