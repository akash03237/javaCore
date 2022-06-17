package com.tech;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DobConversion {
public static void main(String[] args) throws ParseException{
	LocalDate i = LocalDate.of (1999,10,19);

	LocalDate now= LocalDate.now();
	Period diff= Period.between(i, now);
	System.out.println(diff.getYears()+"years"+diff.getMonths()+"months"+diff.getDays()+"days");
	
	
			
		
}
}
