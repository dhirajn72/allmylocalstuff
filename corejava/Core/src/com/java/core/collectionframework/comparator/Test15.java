package com.java.core.collectionframework.comparator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test15 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getDate() + "/" + date.getMonth() + "/"
				+ (date.getYear() + 1900));
		System.out.println(Calendar.DAY_OF_MONTH + "/" + Calendar.MONTH + "/"
				+ Calendar.YEAR);

		System.out.println(date.toGMTString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String str = simpleDateFormat.format(new Date());
		System.out.println(str);

	}

}
