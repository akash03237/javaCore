package com.raystech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarskshet {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setName("akash");
		m1.setRollno("11");
		m1.setMarks(95);
		Marksheet m2 = new Marksheet();
		m2.setName("ajay");
		m2.setRollno("12");
		m2.setMarks(85);
		Marksheet m3 = new Marksheet();
		m3.setName("rehan");
		m3.setRollno("13");
		m3.setMarks(44);
		Marksheet m4 = new Marksheet();
		m4.setName("sonam");
		m4.setRollno("14");
		m4.setMarks(55);
		Marksheet m5 = new Marksheet();
		m5.setName("ram");
		m5.setRollno("15");
		m5.setMarks(65);

		ArrayList<Marksheet> l = new ArrayList<Marksheet>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		Collections.sort(l);
		Iterator<Marksheet> it = l.iterator();
		while (it.hasNext()) {
			Marksheet m = (Marksheet) it.next();
			System.out.println("roll"
					+ "no " + m.getRollno());
			System.out.println("name " + m.getName());
			System.out.println("marks " + m.getMarks());
			System.out.println("=======================");

		}

	}
}