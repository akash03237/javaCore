package com.rays3.tst;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperosn {
public static void main(String[] args)throws ParseException {
	Person a = new Person();
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	String  s = "19/10/2000";
	Date d = sdf.parse(s);
	
	a.setName("akash");
	a.setAddress("indore");
	a.setDob(d);
	System.out.println(a.getAddress());
	System.out.println(a.getName());
	System.out.println(a.getDob());
	System.out.println(Person.age);
}
}