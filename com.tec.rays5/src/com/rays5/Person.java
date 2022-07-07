package com.rays5;

public class Person {
	private String fname;
	private String lname;
	private String address;
	public Person() {
		System.out.println("person def");
	}
	public Person (String fn , String ln) {
		fname= fn;
		lname=ln;
		System.out.println("person 2 param"+fname+lname);
		
	
	}
	public Person (String fn , String ln ,String add) {
		this(fn,ln);
		address = add;
		System.out.println("perso 3 param"+fname+lname+address);
		
		
	}

}
