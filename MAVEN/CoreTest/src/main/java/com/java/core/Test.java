package com.java.core;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	static Logger logger = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {

		logger.info("Main method starts");
		Locale locale = Locale.getDefault();
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getVariant());
		Locale[] locale2 = locale.getAvailableLocales();
		for (Locale l : locale2) {
			System.out.println(l);
		}
		System.out.println(locale.getCountry());
		logger.info("Main method ends");
	}
}
