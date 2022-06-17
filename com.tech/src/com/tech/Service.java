package com.tech;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Service {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-m-yyyy hh:mm:ss");
	Calendar calender = Calendar.getInstance();{
	Calendar.set(2017,Calendar.AUGUST,31,9,30, 15 );
Calendar next = calendar;for(
	int i = 1;i++<10;)
	{
		next = (Calendar) calendar.clone();
		next.add(Calendar.MONTH, i);
		System.out.println(sdf.format(next.getTime()));
	}

}}