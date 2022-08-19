package com.rays.thread;

public class Account {
	private int balance=0;

	public synchronized void deposit(String nm, int amt) {
		int balance = getBalance() + amt;
		setBalance(balance);
		System.out.println(nm + "new balance" + balance);
	}

	public int getBalance() {
		databaseDelay();
		return balance;
	}

	public void setBalance(int balance) {
		databaseDelay();
		this.balance = balance;
	}

	public void databaseDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

}
