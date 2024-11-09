package com.bankapplication;

import java.util.ArrayList;

public class Branch {

	private ArrayList<Customer> customers;
	private String name;
	
	
	public String getName() {
		return this.name;
	}

	
	public Branch(String name) {
		
		this.name = name;
		this.customers= new ArrayList<Customer>();
	}

	// create branch
	public static Branch createNewBranch(String name) {
		return new Branch(name);
	}
	
	
	// Add new customer
	public void addNewCustomer(String name, double transaction) {
		if(getCustomer(name)==null) {
			Customer newCustomer = Customer.createCustomer(name, transaction);
			
			customers.add(newCustomer);
		}else {
			System.out.println("Customer Already Exists");
		}
	}
	
	// Add transaction
	public void addtransaction(String customerName, double transactionAmount) {
		Customer currentCustomer=getCustomer(customerName);
		if(currentCustomer==null) {
			System.out.println("This customer does not exist");
		}else {
			currentCustomer.addTransaction(transactionAmount);
			System.out.println("Added "+ transactionAmount+" to "+ customerName+ "Account successfully!");
		}
		
	}
	
	
	// print customers
	public void printCustomers(boolean showTransaction ) {
		if(!customers.isEmpty()) {
			System.out.println("Customers");
		}
		for(int i = 0; i<customers.size();i++) {
			printSingleCustomer(customers.get(i),showTransaction);
		}
	}
	
	//print single customer 
	public void printSingleCustomer(Customer customer,boolean showTransaction) {
		System.out.println("Name --> "+ customer.getName());
		
		if(showTransaction) {
			customer.printTransactions();
		}
		
	}
	
	//get customers
	
	public  Customer getCustomer(String name) {
		for(int i = 0; i<customers.size();i++) {
			Customer currentCustomer = customers.get(i);
			if(currentCustomer.getName().toLowerCase().equals(name.toLowerCase())) {
				return currentCustomer;
			}
		}
		return null;
	}

	
}
