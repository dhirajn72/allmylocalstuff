package com.java.test.misc;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test4 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = new Date(df.parse("01/06/2017").getTime());
		Date dt2 = new Date(df.parse("02/06/2017").getTime());
		Date dt3 = new Date(df.parse("03/06/2017").getTime());
		Date dt4 = new Date(df.parse("04/06/2017").getTime());
		Date dt5 = new Date(df.parse("05/06/2017").getTime());
		List<Date> list1 = new ArrayList<Date>();
		list1.add(dt1);
		list1.add(dt2);
		list1.add(dt3);
		list1.add(dt4);
		list1.add(dt5);

		Date dtf1 = new Date(df.parse("06/06/2017").getTime());
		Date dtf2 = new Date(df.parse("06/06/2017").getTime());
		Date dtf3 = new Date(df.parse("08/06/2017").getTime());
		Date dtf4 = new Date(df.parse("09/06/2017").getTime());
		Date dtf5 = new Date(df.parse("10/06/2017").getTime());
		Date dtf6 = new Date(df.parse("05/06/2017").getTime());
		List<Date> list2 = new ArrayList<Date>();
		list2.add(dtf1);
		list2.add(dtf2);
		list2.add(dtf3);
		list2.add(dtf4);
		list2.add(dtf5);
		list2.add(dtf6);

		Set<Date> set1 = new HashSet<Date>(list1);
		Set<Date> set2 = new HashSet<Date>(list2);

		List<Date> dates1 = new ArrayList<Date>(set1);
		List<Date> dates2 = new ArrayList<Date>(set2);

		Map<String, List<Date>> map1 = new HashMap<String, List<Date>>();

		map1.put("A", list1);
		map1.put("B", list2);

		Set<String> map1KeySet = map1.keySet();
		for (String st : map1KeySet) {
			System.out.println(st + "->" + map1.get(st));
		}

		System.err.println("***********************************************");

		Map<Date, Set<String>> map2 = new HashMap<Date, Set<String>>();

		Set<String> map1Key = map1.keySet();
		Collection<List<Date>> map1Values = map1.values();

		for (List<Date> d1 : map1Values) {
			for (Date d : d1) {
				map2.put(d, map1Key);
			}
		}
		Map<String, String> entry = new HashMap<String, String>();

		Set<Date> map2KeySet = map2.keySet();

		for (Date d : map2KeySet) {
			if (dates1.contains(d) && dates2.contains(d)) {
				System.out.println(d + ":" + map2.get(d));

			} else if (dates1.contains(d)) {
				System.out.println(d + ":" + "[A]");
			} else if (dates2.contains(d)) {
				System.out.println(d + ":" + "[B]");
			}

		}

	}
}
