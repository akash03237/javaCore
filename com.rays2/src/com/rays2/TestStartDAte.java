package com.rays2;

import java.text.ParseException;
import java.time.LocalDate;

public class TestStartDAte {
	public static void main(String[] args) throws ParseException {
		LocalDate EndDate = LocalDate.of(2020, 10, 19);
		System.out.println("end date is" + EndDate);

		LocalDate StartDate = LocalDate.now();
		System.out.println("today date is" + StartDate);
		if (EndDate.isAfter(StartDate)) {
			System.out.println(" '__' ");
		} else if (EndDate.isBefore(StartDate)) {
			System.out.println("ERROR your date is incorrect");
		}

	}
}