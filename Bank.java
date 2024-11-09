package com.bankapplication;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Branch> branches = new ArrayList<Branch>();

	
	// Add new Branch
	public void addBranch(String name) {
		Branch currentBranch = getBranch(name);
		if(currentBranch==null) {
		Branch newBranch =	Branch.createNewBranch(name);
		branches.add(newBranch);
			
		}else {
			System.out.println("This branch already Exist");
		}
	}
	
	//add customer to branch
	public void addCustomerToBranch(String branchName,String customerName,double initialDeposit) {
		Branch currentBranch = getBranch(branchName);
		
		if(currentBranch == null) {
			System.out.println("This Branch does not exist");
		}else {
			currentBranch.addNewCustomer(customerName, initialDeposit);
			
		}
	}
	
	// print customer list for branch
	public void printCustomerList(String branchName,boolean showTransaction) {
		Branch currentBranch = getBranch(branchName);
		if(currentBranch==null) {
			System.out.println("This branch does not Exist");
			
		}else {
			currentBranch.printCustomers(showTransaction);
		}
	}
	
	// add transaction for an existing customer for that branch  
	public void addCustomerTransaction(String branchName,String customerName,double initialDeposit) {
		Branch currentBranch = getBranch(branchName);
		if(currentBranch==null) {
			System.out.println("This branch does not Exist");
		}else {
			currentBranch.addtransaction(customerName, initialDeposit);
		}
	}
	
	// getBranch
	public Branch getBranch(String name) {
		for(int i=0; i< branches.size(); i++ ) {
			Branch currentBranch = branches.get(i);
			if(currentBranch.getName().toLowerCase().equals(name.toLowerCase())) {
				return currentBranch;
			}
		}
		return null;
	}
	
	//print branch
	public void printBranches() {
		for(int i=0; i< branches.size(); i++ ) {
			Branch currentBranch = branches.get(i);
			System.out.println("Branch Name --> "+currentBranch.getName());
			
			
			currentBranch.printCustomers(false);
		}
	}
}
