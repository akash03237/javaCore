package com.raystech.collections;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector l = new Vector();

		l.add("one");
		l.add("two");
		Integer i = new Integer(3);
		l.add(i);
		Integer value = (Integer) l.get(2);

		System.out.println("Index#3 value = " + value);

	}

}
