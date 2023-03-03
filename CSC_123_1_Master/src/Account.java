// Title: Assignment 04
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/02/2023

import java.util.ArrayList;
import java.util.List;

abstract class Account {
    
    private List<Transaction> transactions;
    private static int accountNumberGenerator = 1000;
    private final int accountNumber;
    private final String firstName;
    private final String lastName;
    private final String ssn;
    private double balance;
    private boolean open;
    private boolean lastWithdrawalSuccessful;
    private boolean depositSuccessful;
    private static int idGenerator = 100;

    public Account(String firstName, String lastName, String ssn) {
        this.accountNumber = accountNumberGenerator++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = 0.0;
        this.open = true;
        this.lastWithdrawalSuccessful = false;
        this.depositSuccessful = false;
        this.transactions = new ArrayList<>();
    }

    public class Transaction {
        private int id;
        private String type;
        private double amount;

        public Transaction(int id, String type, double amount) {
            this.id = idGenerator++;
            this.type = type;
            this.amount = amount;
        }

        public String toString() {
            return String.format("%s %s %.2f", id, type, amount);
        }
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isOpen() {
        return open;
    }

    public void setwithdrawsuccessful() {
        this.lastWithdrawalSuccessful = true;
    }

    public void settranscations(double amount) {
        transactions.add(new Transaction(accountNumber, "Debit", amount));
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void deposit(double amount) {
        balance += amount;
        depositSuccessful = true;
        transactions.add(new Transaction(accountNumber, "Credit", amount));
    }

    public void withdraw(double amount) {
        if (!open) {
            System.out.println("Account is closed." + "\n");
            return;
        }
        if (amount <= 0) {
            System.out.println("Withdrawal amount should be positive." + "\n");
            return;
        }

        if (open && amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction(accountNumber, "Debit", amount));
            lastWithdrawalSuccessful = true; // set to true if the withdrawal was successful
        } else {
            lastWithdrawalSuccessful = false; // set to false if the withdrawal failed
        }

    }

    public void closeAccount() {
        open = false;
    }

    public boolean isLastWithdrawalSuccessful() {
        return lastWithdrawalSuccessful;
    }

    public boolean isdepositSuccessful() {
        return depositSuccessful;
    }

    public abstract double calculateInterest();

    public String toString() {
        String accountType = this instanceof CheckingAccount ? "Checking" : "Savings";
        String op;
        if (open) {
            op = "Open";
        } else {
            op = "Closed";
        }
        return accountNumber + "(" + accountType + ")" +
                " : " + firstName + " : " + lastName +
                " : " + ssn +
                " : " + String.format("%.1f", balance) +
                " : Account " + op;
    }
}