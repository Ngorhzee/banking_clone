package com.bankapplication;

import java.util.Scanner;

public class Main {

	    // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

		public static void main(String[] args) {
			System.out.println("Welcome To Online Banking");
			printOptions();
			boolean quit = false;
			while (!quit) {
				System.out.println("Select Option");
				int option = scanner.nextInt();
				scanner.nextLine();
	
				switch (option) {
				case 1:
					addNewBranch();
					break;
				case 2:
					addNewCustomertoBranch();
					break;
				case 3:
					printCustomers();
					break;
				case 4:
					addNewtransaction();
					break;
				case 5:
					bank.printBranches();
					break;
				case 6:
					printOptions();
					break;
				case 7:
				quit = true;
					break;
	
				}
			}
		}

	private static Scanner scanner = new Scanner(System.in);
	private static Bank bank = new Bank();

	public static void printOptions() {
		System.out.println("What would you like to do today? \n" + "option 1 --> Add new Branch \n"
				+ "option 2 --> Add new customer to branch \n" + "option 3 --> print customer list for branch \n "
				+ "option 4 --> Add new transaction to customer \n" + "option 5 --> show branches list \n"
				+ "option 6 --> show options again \n" + "option 7 --> Quit");
	}

	public static void addNewBranch() {
		System.out.println("Enter New Branch Name ");
		String branchName = scanner.nextLine();
		bank.addBranch(branchName);

	}

	public static void addNewCustomertoBranch() {
		System.out.print("Enter  Branch Name ");
		String branchName = scanner.nextLine();
		System.out.print("Enter New customer Name ");
		String customerName = scanner.nextLine();
		System.out.print("Enter Intial Deposit ");
		double initialDeposit = scanner.nextDouble();
		bank.addCustomerToBranch(branchName, customerName, initialDeposit);
	}

	public static void printCustomers() {
		System.out.print("Enter  Branch Name ");
		String branchName = scanner.nextLine();
		System.out.print("Do You want a list of the transactions Y/N: ");
		String showTransaction = scanner.nextLine();
		switch (showTransaction.toLowerCase()) {
		case "y":
			bank.printCustomerList(branchName, true);
			break;
		case "n":
			bank.printCustomerList(branchName, false);
			break;
		default:
			bank.printCustomerList(branchName, false);
			break;
		}

	}

	public static void addNewtransaction() {
		System.out.print("Enter Branch Name ");
		String branchName = scanner.nextLine();
		System.out.print("Enter customer Name ");
		String customerName = scanner.nextLine();
		System.out.print("Enter  Deposit ");
		double initialDeposit = scanner.nextDouble();
		bank.addCustomerTransaction(branchName, customerName, initialDeposit);
	}

	
}
