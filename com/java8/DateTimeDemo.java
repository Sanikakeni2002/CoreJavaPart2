package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Date: "+d);
		
		LocalDate currentDate= LocalDate.now();//for date
		System.out.println("Current date is : "+currentDate);
		
		LocalTime currentTime = LocalTime.now();// for time 
		System.out.println("Current time is : "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();// for date and time
		System.out.println("Current date and time is : "+currentDateTime);

		ZoneId currentZone = ZoneId.systemDefault();//by default zone Asia/Calcutta
		System.out.println("Current zone is : "+currentZone);
		
		System.out.println("Current year is leap : "+currentDate.isLeapYear());
		System.out.println("Plus days is : "+currentDate.plusDays(3));
		System.out.println("Plus month is : "+currentDate.plusMonths(4));
		System.out.println("Plus week is : "+currentDate.plusWeeks(2));
		
		System.out.println("Minus days is : "+currentDate.minusDays(5));
		System.out.println("Minus months is : "+currentDate.minusMonths(2));
		System.out.println("Minus weeks is : "+currentDate.minusWeeks(1));
	}

}
