package com.tech.eleven8;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private String Fname;
	private String Lname;
	private int age;
	private int sallery;

	public Employee() {

	}

	public Employee(String fname, String lname, int age, int sallery) {
		super();
		Fname = fname;
		Lname = lname;
		this.age = age;
		this.sallery = sallery;

	}

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int getAge() {
		return age;
	}

	public int getSallery() {
		return sallery;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.Fname.compareTo(o.Fname);
	}

}
