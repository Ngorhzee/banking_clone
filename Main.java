package com.bankapplication;

import java.util.Scanner;

public class Main {
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

	public static void main(String[] args) {
		System.out.println("Welcome To Online Banking");
		printOptions();
		while (true) {
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
				break;

			}
		}
	}
}
