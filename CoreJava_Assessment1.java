package com.hughes.handson;

class Account {
	String accountId;
	String accountName;
	String address;
	int depositAmount;

	Account(String accountId, String accountName, String address) {
		this.accountId = accountId;
		this.depositAmount = 0;
		this.accountName = accountName;
		this.address = address;
	}

	public String getDetails() {
		return "Account ID: " + accountId + "\n" + "Account Name: " + accountName + "\n" + "Address: " + address;
	}

	void showDetails() {
		System.out.println("Your Account ID is: " + this.accountId);
		System.out.println("Your Account Name is: " + this.accountName);
		System.out.println("Your Address is: " + this.address);
	}

	void depositAmount(int amount) {
		this.depositAmount += amount;
	}

}

class Loan extends Account {
	int loanId;
	String loanType;
	int loanAmount;
	static int counter = 0;

	Loan(String accountId, String accountName, String address) {
		super(accountId, accountName, address);
	}

	void getLoan(String loanType, int loanAmount) {
		counter++;
		this.loanId = counter;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
	}

	void showLoanDetails() {
		if (this.loanAmount > 0) {
			System.out.println("Your Loan ID is: " + this.loanId);
			System.out.println("Your Loan Type is: " + this.loanType);
			System.out.println("Your Loan Amount is: " + this.loanAmount);
		}
	}

	void withdrawAmount(int amount) {
		if (this.loanAmount >= amount) {
			this.loanAmount -= amount;
		} else {
			System.out.println("Not Enough Balance");
		}
	}
}

public class CoreJava_Assessment1 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];

		// Adding sample accounts
		accounts[0] = new Account("1234567-ASDF", "John Doe", "123 Main St");
		accounts[1] = new Loan("2345678-QWER", "Jane Smith", "456 Elm St");
		((Loan) accounts[1]).getLoan("home", 100000); // Casting to Loan to access getLoan method

		// Sample transactions
		accounts[0].depositAmount(500); // Depositing 500 in account 0
		((Loan) accounts[1]).withdrawAmount(20000); // Withdrawing 20000 from loan account 1

		// Displaying account details
		accounts[0].showDetails();
		((Loan) accounts[1]).showLoanDetails();
	}
}
