// Title: Assignment 05
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

public class CheckingAccount extends Account {
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
        if (!isOpen()) {
           
            try {
                setwithdrawsuccessful(false);
                throw new AccountClosedException("Account is closed");
            } catch (AccountClosedException e) {
                e.printStackTrace();
            }
        }
        else if (getBalance() + overdraftLimit >= amount && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            setwithdrawsuccessful(true);
            settranscations(amount);
        } else {
            try {
                throw new InsufficientBalanceException("Insufficient balance");
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }
    }
}