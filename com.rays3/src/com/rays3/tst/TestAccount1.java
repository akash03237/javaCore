package com.rays3.tst;

public class TestAccount1 {
	public static void main(String[] args) {

		TestAccount a = new TestAccount();
		a.setAccountype("Saving");
		a.setNumber("022710199643");
		a.setBalance(10);
		System.out.println(a.getAccountype() + "  " + a.getNumber() + "  " + a.getBalance());
		
		System.out.println("after deposite=" + a.getBalance());
		a.deposit(5);
		System.out.println("after withdrawl=" + a.getBalance());
		a.withdrawl(5);
		System.out.println("after fundtransfer=" + a.getBalance());
		a.fundtransfer(2);
		System.out.println("after paybill=" + a.getBalance());
		a.paybill(1);
		System.out.println("present balance=" + a.getBalance());
	}
}
