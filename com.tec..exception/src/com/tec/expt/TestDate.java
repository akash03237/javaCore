package com.tec.expt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dd = sdf.format(d);
		System.out.println(dd);
		String dt = "05/08/2022";
		Date nd = null;
		try {
			nd = sdf.parse(dt);
		} catch (ParseException e) {
		}
		System.out.println(nd);
	}

}
