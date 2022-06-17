package com.Stringpr;

public class TestPerson {

	public static void main(String[] args) {
		Person p = null;
		p = new Person();
		p.setName("anuj");
		p.setAddress("MG Road");
		System.out.println("Name:" + p.getName());
		System.out.println("Address:" + p.getAddress());

	}

}
