package com.raystech.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue s = new PriorityQueue<>();
		s.add(2.36);
		s.add(6.50);
		s.add(6.36);
		s.add(5.36);
		s.add(3.36);
		s.add(7.36);
		s.add(1.36);
		//first elee is priority int h e to sare int char to sare char
		//s.add("akash");
		System.out.println(s);
		System.out.println(s.remove());
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.offer(9.36));
		System.out.println(s.poll());//head returns

	}

}
