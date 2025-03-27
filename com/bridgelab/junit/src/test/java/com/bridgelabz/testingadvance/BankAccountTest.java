package com.bridgelabz.testingadvance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.spec.ECField;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    // Initializes a BankAccount instance before each test
    @BeforeEach
    void setup() {
        account = new BankAccount("deepak", 1000);

    }

    // Tests depositing money into the account.
    @Test
    void testdeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    // Tests withdrawing money from the account
    @Test
    void withdraw() {
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    // Tests withdrawal when balance is insufficient
    @Test
    void testinsufficientBalance() {
        double amount = 2000;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(amount));
        assertEquals("Insufficient balance", exception.getMessage());
    }

    // Tests withdrawal of a negative amount
    @Test
    void testAmountNegative() {
        double amount = -200;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(amount));
        assertEquals("Withdraw amount must be positive", exception.getMessage());
    }

}