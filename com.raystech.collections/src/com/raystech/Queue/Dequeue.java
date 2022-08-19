package com.raystech.Queue;

import java.util.ArrayDeque;

public class Dequeue {
	public static void main(String[] args) {
		ArrayDeque d = new ArrayDeque();
		d.add(23);
		d.add(12);
		d.add(56);
		d.add(78);
		d.add(13);
		d.add(4);

		d.addFirst(100);//first and last me value add karta he 
		d.addLast(200);//------------->>>>>>>>>>>>>/\
		System.out.println(d);
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
	}

}
