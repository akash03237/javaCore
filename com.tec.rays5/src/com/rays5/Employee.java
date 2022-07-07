package com.rays5;

public class Employee extends Person {
	private String designation;
	public Employee() {
		System.out.println("employee def");
		
	}
	public Employee(String fn , String ln ,String des) {
		super(fn,ln);
		designation=des;
		System.out.println("employee 3 peram");
	}
public static void main(String[] args) {
	Employee e = new Employee("akash","soni","developer");
}
}
