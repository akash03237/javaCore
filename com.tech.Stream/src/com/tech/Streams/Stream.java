package com.tech.Streams;

import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("one", "two", "three", "four", "five","five");
		java.util.stream.Stream<String> st = li.stream();
		
		st.filter(e->e.startsWith("f")).map(e->e.toUpperCase()).sorted().limit(6).distinct().forEach(s -> System.out.println(s));
		

	}
//distict duplicate filter krega
	
}
