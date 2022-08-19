package com.rays.tec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		System.out.println("----------------");
		SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = a.format(d);
		System.out.println(strDate);
 Date pDate =  a.parse("19/5/2025");
 System.out.println(pDate);
	}

}
