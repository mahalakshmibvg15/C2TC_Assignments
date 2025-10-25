package com.tnsif.assignmentone.assignment3;

public class Bank {
	private static int totalAccounts = 0;

    // Constructor increments totalAccounts when new account created
    public Bank() {
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

}
