// Title: Assignment 05
// Author: Raul E Gonzalez
// E-mail: Rgonzalez365@toromail.csudh.edu
// Date: 03/14/2023

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            displayMenu();
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.print("Enter social security number: ");
                    String ssn = scanner.next();
                    System.out.print("Enter overdraft limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    Account checkingAccount = new CheckingAccount(firstName, lastName, ssn, overdraftLimit);
                    accounts.add(checkingAccount);
                    System.out.println("Thank you, the account number is " + checkingAccount.getAccountNumber());
                    break;
                case 2:
                    System.out.print("Enter first name: ");
                    firstName = scanner.next();
                    System.out.print("Enter last name: ");
                    lastName = scanner.next();
                    System.out.print("Enter social security number: ");
                    ssn = scanner.next();
                    Account savingsAccount = new SavingsAccount(firstName, lastName, ssn);
                    accounts.add(savingsAccount);
                    System.out.println("Thank you, the account number is " + savingsAccount.getAccountNumber());
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    boolean accountFound3 = false;
                    for (Account acc : accounts) {
                    if (acc.getAccountNumber() == accountNumber) {
                            accountFound3 = true;                   
                }
            if(accountFound3){

                for (Account account : accounts) {
                    System.out.println(account.toString());
                }
            }
            }if (!accountFound3) {
                try {
                    throw new NoSuchAccountException("Account does not exist");
                } catch (NoSuchAccountException e) {
                   
                    e.printStackTrace();
                }
            }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    boolean accountFound2 = false;
                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == accNum) {
                            accountFound2 = true;
                        if(acc.isOpen()){
                            List<Account.Transaction> transactions = acc.getTransactions();
                            for (Account.Transaction transaction : transactions) {
                                System.out.println(transaction.toString());                               
                            }
                            System.out.printf("Balance: %.2f%n",acc.getBalance());
                            break;
                            
                        }else {
                            try {
                                throw new AccountClosedException("Account is closed");
                            } 
                            catch (AccountClosedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    }
                    if (!accountFound2) {
                        try {
                            throw new NoSuchAccountException("Account does not exist");
                        } catch (NoSuchAccountException e) {                           
                            e.printStackTrace();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter account number: ");
                    int accNumber = scanner.nextInt();
                    boolean accountFound = false;
                    for (Account account : accounts) {
                        if (account.getAccountNumber() == accNumber) {
                            accountFound = true;
                            System.out.print("Enter amount to deposit: ");
                            double amount = scanner.nextDouble();
                            account.deposit(amount);
                            if (account.isdepositSuccessful()) {
                                System.out.printf("Deposit successful, the new balance is: %.2f%n",
                                        account.getBalance());
                            } 
                            else {
                                System.out.printf("Deposit failed, the balance is: %.2f%n", account.getBalance());
                            }
                            break;
                        }
                    }
                    if (!accountFound) {
                        try {
                            throw new NoSuchAccountException("Account does not exist");
                        } 
                        catch (NoSuchAccountException e) {                          
                            e.printStackTrace();
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter account number: ");
                    int accountNum = scanner.nextInt();
                    boolean accountFound1 = false;
                    for (Account account : accounts) {
                        if (account.getAccountNumber() == accountNum) {
                            accountFound1 = true;
                            System.out.print("Enter amount to withdraw: ");
                            double amount = scanner.nextDouble();
                            try {                           
                                account.withdraw(amount);
                            } catch (AccountClosedException e) {
                                e.printStackTrace();
                            }
                            if (account.isLastWithdrawalSuccessful()) {
                                System.out.printf("Withdrawal successful, the new balance is: %.2f%n",
                                        account.getBalance());
                            } else {
                                System.out.printf("Withdrawal failed, the balance is: %.2f%n", account.getBalance());
                            }
                            break;
                        }
                    }
                    if (!accountFound1) {
                        try {
                            throw new NoSuchAccountException("Account does not exist");
                        } catch (NoSuchAccountException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter account number to close: ");
                    int accountNumberr = scanner.nextInt();
                    boolean foundAccount = false;
                    for (Account account : accounts) {
                        if (account.getAccountNumber() == accountNumberr) {
                            account.closeAccount();
                            foundAccount = true;
                            System.out.printf(
                                    "Account closed, current balance is %.2f, deposits are no longer possible%n",
                                    account.getBalance());
                            break;
                        }
                    }
                    if (!foundAccount) {
                        try {
                            throw new NoSuchAccountException("Account does not exist");
                        } catch (NoSuchAccountException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                    case 8:
                    System.out.print("Enter account number: ");
                    int accNumm = scanner.nextInt();
                    boolean accountFound8 = false;
                    for (Account acc : accounts) {
                        if (acc.getAccountNumber() == accNumm) {
                            accountFound8 = true;
                     if(acc.isOpen()){
                    try {
                        List<Account.Transaction> transactions = acc.getTransactions();
                        BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.txt"));
                        for (Account.Transaction transaction : transactions) {
                            writer.write(transaction.toString());
                            writer.newLine();
                        }
                        writer.write("Balance :"+ acc.getBalance());
                        writer.close();
                        System.out.println("Transactions saved to transactions.txt");
                    } catch (IOException e) {
                        System.out.println("Error saving transactions to file: " + e.getMessage());
                    }
                }else {
                    try {
                        throw new AccountClosedException("Account is closed");
                    } catch (AccountClosedException e) {
                        e.printStackTrace();
                    }
                }
            }
            }if (!accountFound8) {
                try {
                    throw new NoSuchAccountException("Account does not exist");
                } catch (NoSuchAccountException e) {
                    e.printStackTrace();
                }
            }
                    break;
                case 9:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 9);
        scanner.close();
    }
    public static void displayMenu() {
        System.out.println("Banking Application Menu:");
        System.out.println("1 - Open a Checking account");
        System.out.println("2 - Open a Savings account");
        System.out.println("3 - List Accounts");
        System.out.println("4 - Account Statement");
        System.out.println("5 - Deposit funds");
        System.out.println("6 - Withdraw funds");
        System.out.println("7 - Close an account");
        System.out.println("8 - Save Transactions");
        System.out.println("9 - Exit");
    }
}