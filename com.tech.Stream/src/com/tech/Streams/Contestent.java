package com.tech.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestent {
	
	public String name;
	public String phone;
	public Contestent(String n ,String p) {
		phone =p;
		name = n;
	}
	public static void main(String[] args) {
		
	
		ArrayList<Contestent>list= new ArrayList<Contestent>();
		list.add(new Contestent("rohan", "1234569870"));
		list.add(new Contestent("ajay", "2314698700"));
		list.add(new Contestent("neha", "789654132"));
		list.add(new Contestent("chetan", "1236547890"));
		list.add(new Contestent("jack", "1122564789"));
		list.add(new Contestent("jacky", "3265147922"));
		list.add(new Contestent("deep", "9857463210"));
		list.add(new Contestent("nena", "145236987"));
		list.add(new Contestent("geetu", "1542638970"));
		list.add(new Contestent("invalid no", "12345"));
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e -> System.out.println(e));
	}

}		
