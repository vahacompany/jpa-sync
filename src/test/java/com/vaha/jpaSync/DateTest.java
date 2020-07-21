package com.vaha.jpaSync;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {
	
	public static void main(String args[]) {
		SimpleDateFormat dd = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat tm = new SimpleDateFormat("HHmmss");
				
		Calendar dateTime = Calendar.getInstance();
		       
		String format_time1 = dd.format(dateTime.getTime());
		String format_time2 = tm.format(dateTime.getTime());
		
		System.out.println(format_time1);
		System.out.println(format_time2);
	}

}
