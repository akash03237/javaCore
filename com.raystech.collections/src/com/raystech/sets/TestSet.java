package com.raystech.sets;

import java.util.HashSet;

public class TestSet {
	public static void main(String[] args) {
		HashSet s = new HashSet<>();
		s.add(12);
		s.add(15);
		s.add(17);
		s.add(16);
		s.add(8);
		s.add(96);// koi order maintain nahi karta see output
		System.out.println(s);

	}
}
