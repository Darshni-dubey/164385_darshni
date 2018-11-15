package com.onkar.bank;//collection of logical classes

import java.util.Set;

public class BankAccount {

	//static variable-one copy shared 
	private static int autoAccountNo;
	
	//instance variable -we can not use instance variable if objects are not created
	 int accountNo;
	private String accountHolderName;
	private double accountBalance;
	
	//init block -it has to get execute first(well before constructor)
	{
		//System.out.println("init block"); logically not their
		accountNo=++autoAccountNo;
	}
	
	//constructor overloading- when offering variety to end-user
	
	//default constructor
	public BankAccount() { //initializing instance variable
		//accountNo=autoAccountNo;
		accountHolderName="unknown";
		accountBalance=0;
		//System.out.println("default constructor");
	}
	
	
	//parameterized constructor-create object only when information is given
	public BankAccount(String accountHolderName, double accountBalance){
		
	
		//accountNo=++autoAccountNo;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
		//System.out.println("parameterize constructor");
	}
	
//setter method-modify and re-initilaize the member variables

	public void setAccountHolderName(String accountHolderName) { 
		this.accountHolderName = accountHolderName;
	}

	//getter methods-

	public int getAccountNo() {
		return accountNo;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	//service method
	public void withdraw(double amount){
		this.accountBalance-=amount;
	}

	public void deposit(double amount){
		this.accountBalance+=amount;
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		BankAccount acc2 = new BankAccount("onkar",5000);
	}
	
}
