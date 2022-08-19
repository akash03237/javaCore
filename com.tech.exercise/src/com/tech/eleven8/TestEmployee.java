package com.tech.eleven8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee m = new Employee("akash","soni", 50, 0);
		Employee m1 = new Employee("rahul","soni", 20, 0);
		ArrayList<Employee> a= new ArrayList<Employee>();
		a.add(m);
		a.add(m1);
		Collections.sort(a);
		
		Iterator<Employee> it = a.iterator();
		while (it.hasNext()) {
			Employee em= (Employee)it.next();
			System.out.println(em.getFname());
			System.out.println(em.getLname());
			System.out.println(em.getAge());
			System.out.println(em.getSallery());
		}
		
		
}}