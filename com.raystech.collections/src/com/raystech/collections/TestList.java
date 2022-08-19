package com.raystech.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestList {
	public static void main(String[] args) {

		List a = new ArrayList<>();
		a.add(22);
		a.add(23.5);
		a.add('a');
		a.add("akash");

		System.out.println("this is in array" + a);
		for (Object ob : a) {
			System.out.println();
			System.out.println("this is in sequential " + ob);
		}

	}
}
