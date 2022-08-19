package com.tech.eleven8;

import java.util.Stack;

public class StackAtoZ {
	public static void main(String[] args) {
		Stack<Object> s = new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		s.push("g");
		s.push("h");
		s.push("i");
		s.push("j");
		s.push("k");
		s.push("l");
		s.push("m");
		s.push("n");
		s.push("o");
		s.push("p");
		s.push("q");
		s.push("r");
		s.push("s");
		s.push("t");
		s.push("u");
		s.push("v");
		s.push("w");
		s.push("x");
		s.push("y");
		s.push("z");
		//System.out.println(s.pop());
		Stack<Object> s1 = new Stack<>();
		s1.push(s);
		System.out.println(s1.pop());
		//System.out.println(s1);
		
		
		
		
	}	

}
