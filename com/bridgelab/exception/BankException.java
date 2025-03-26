package com.bridgelab.exception;

import java.util.Scanner;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message); // Call the constructor of the Exception class
    }
}


// Bank Account Class
class BankAccount {
    private double balance; // Variable to store account balance

    // Constructor to initialize balance
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money from account
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Check amount is greater than balance
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Deduct the amount from the balance
        this.balance -= amount;

        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

// Main Class to test the Bank Account functionality
public class BankException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        // Creating a BankAccount object initial balance 1000
        BankAccount account = new BankAccount(1000);

        System.out.println("Enter the amount to withdraw:");
        double amount = sc.nextDouble(); // Read user input

        try {
            if(amount<0) throw new IllegalArgumentException("Amount must be positive");
            // Attempt to withdraw the entered amount
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Handle case where balance is insufficient
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle case where entered amount is negative
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner to prevent resource leaks
            sc.close();
        }
    }
}
