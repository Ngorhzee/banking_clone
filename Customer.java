package com.bankapplication;

import java.util.ArrayList;

public class Customer {
	 private String name;
	 private ArrayList<Double> transaction = new ArrayList<Double>();
	 
	 
	private Customer(String name, Double transaction) {
		super();
		this.name = name;
		this.transaction.add(transaction);
	}
	

	public String getName() {
		return name;
	}
	
	
	public  static Customer createCustomer(String name, double transactionAmount) {
		
	return	new Customer(name,transactionAmount);
	
	}
	
	public void addTransaction(Double transaction) {
		this.transaction.add(transaction);
	}
	
	
	public void printTransactions() {
		if(this.transaction.isEmpty()) {
			System.out.println("No transactions yet");
		}else {
			System.out.println("Transactions List");
			for(int i=0; i<this.transaction.size();i++) {
				System.out.println((i+1)+"-->"+ this.transaction.get(i));
			}
		}
	}
	
	
	 
	 
}
