package com.rays3.tst;

public class TestClone {
	public static void main(String[] args) throws CloneNotSupportedException {

		BankAccount b = new BankAccount();
		b.setBankAccno(199450698);
		b.setBalance(17000);
		b.setId(4);
		Customer c = new Customer();
		c.setName("akashsoni");
		c.setAddr("tilak nagar");
		c.setId(2);
		c.setAccount(b);

		Customer c2 = (Customer) c.clone();

		System.out.println(c.getAddr());
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAccount().getBalance());
		System.out.println(c.getAccount().getId());
		System.out.println(c.getAccount().getBankAccno());

		System.out.println(c2.getAddr());
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getAccount().getBalance());
		System.out.println(c2.getAccount().getId());
		System.out.println(c2.getAccount().getBankAccno());

	}
}