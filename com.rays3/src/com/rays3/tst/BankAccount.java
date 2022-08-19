package com.rays3.tst;

import javax.security.auth.login.AccountException;

public class BankAccount {
	private int id ;
	private int balance;
	private int BankAccno ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBankAccno() {
		return BankAccno;
	}
	public void setBankAccno(int bankAccno) {
		BankAccno = bankAccno;
	}
	
	

}
