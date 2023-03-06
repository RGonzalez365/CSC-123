// Title: Assignment 04
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/02/2023

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String firstName, String lastName, String ssn, double overdraftLimit) {
        super(firstName, lastName, ssn);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.01;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            setwithdrawsuccessful();
            settranscations(amount);
        } else {
            System.out.println("Insufficient funds." + "\n");
        }
    }
}