package com.raystech.collections;

import java.util.LinkedList;
import java.util.List;

public class TestLink {
	public static void main(String[] args) {
		List li = new LinkedList();
		li.add(22);
		li.add(23.2);
	    li.add('a');
		li.add("akash");
		li.add(108);
		System.out.println(li.subList(1, 5));
	}

}
