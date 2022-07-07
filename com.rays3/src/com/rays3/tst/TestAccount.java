package com.rays3.tst;

public class TestAccount {
	private String number;
	private String accountype;
	private double balance;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountype() {
		return accountype;
	}

	public void setAccountype(String accountype) {
		this.accountype = accountype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(int d) {
		double total = getBalance() + d;
		setBalance(total);

	}

	public void withdrawl(int w) {
		double total = getBalance() -w;
		setBalance(total);
	}
	public void fundtransfer (double f) {
		double total= getBalance()-f;
		setBalance(total);
	}
	
	public void paybill (double p) {
		double total= getBalance()-p;
		setBalance(total);
	}

}
