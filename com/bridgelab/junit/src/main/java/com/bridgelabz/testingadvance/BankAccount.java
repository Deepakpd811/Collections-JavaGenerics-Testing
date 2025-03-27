package com.bridgelabz.testingadvance;

public class BankAccount {
    private String name;
    private double balance;

    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    // Method to Adds money to the account, ensuring the amount is positive.
    public void deposit(double amount){
        if(amount <0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance +=amount;

        System.out.println("Deposited: "+ amount);
    }

    // Method to Deducts money from the account, checking for valid and sufficient funds.
    public void withdraw(double amount){
        if(amount <0){
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if(amount>this.balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance -=amount;
        System.out.println("Withdraw: "+ amount);
    }

    public double getBalance() {
        return balance;
    }
}
