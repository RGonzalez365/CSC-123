// Title: Assignment 05
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class SavingsAccount extends Account {
    private static double annualInterestRate = 0.01;
    public SavingsAccount(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    @Override
    public double calculateInterest() {
        return getBalance() * annualInterestRate;
    }
}