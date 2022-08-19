package com.raystech.collections;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(7);
		s.push(56);
		System.out.println(s.pop());// last ele remove hoga56 or7 reoved
		System.out.println(s.pop());// returns top and remove it from steack
		System.out.println(s);// all ele prints
		System.out.println(s.peek());// return top and does not remove it 
		System.out.println(s.peek());
		System.out.println(s);

	}
}
