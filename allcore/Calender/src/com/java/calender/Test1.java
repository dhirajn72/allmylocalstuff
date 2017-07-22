/**
 * 
 */
package com.java.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Dhiraj Singh
 * @email dhiraj.singh.90@facebook.com
 *
 */
public class Test1 {

	public static void main(String[] args) {

		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.get(Calendar.DATE) + "/"
				+ (calendar.get(Calendar.MONTH) + 1) + "/"
				+ calendar.get(Calendar.YEAR));

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dt = simpleDateFormat.format(new Date());
		System.out.println(dt);

		Locale locale = new Locale("en");
		System.out.println(locale.getLanguage()+" "+locale.getDisplayCountry());

	}
}
