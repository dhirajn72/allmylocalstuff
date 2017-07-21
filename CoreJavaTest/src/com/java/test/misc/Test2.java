package com.java.test.misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
	public static void main(String[] args) throws ParseException {

		
		
		Date d1 = new Date(); 
		Date d2 = new Date(); 
		Date d3 = new Date(); 
		Date d4 = new Date(); 
		Date d5 = new Date(); 
		
		Date dt1 = new Date(); 
		Date dt2 = new Date(); 
		Date dt3 = new Date(); 
		Date dt4 = new Date(); 
		Date dt5 = new Date(); 
		
		
		List<Date> dateList1 = new ArrayList<Date>();
		dateList1.add(d1);
		dateList1.add(d2);
		dateList1.add(d3);
		dateList1.add(d4);
		dateList1.add(d5);
		
		List<Date> dateList2 = new ArrayList<Date>();
		dateList2.add(dt1);
		dateList2.add(dt2);
		dateList2.add(dt3);
		dateList2.add(dt4);
		dateList2.add(dt5);
		
		Map<String, List<Date>> map = new HashMap<String, List<Date>>();
		map.put("A", dateList1);
		map.put("B", dateList2);

	
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(d1);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);
		

		
		System.err.println("************");
		
		
		
	}

}
