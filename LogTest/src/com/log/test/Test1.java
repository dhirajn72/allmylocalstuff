package com.log.test;

import org.apache.log4j.Logger;

import com.log.test.util.StringUtil;

public class Test1 {

	protected final static Logger _log = Logger.getLogger(Test1.class);

	public static void main(String[] args) {

		_log.info("Main method has started");
		System.out.println("Adding two numbers: " + (5 + 20));
		_log.info("Two numbers has been added");
		System.out.println("Adding three numbers: " + (5 + 60 + 20));
		_log.info("Three numbers has been added");
		_log.info("Calling method2()");
		for(int i=0;i<=50000;i++){
		method2();
		}
		_log.info("Called method2()");
		_log.info("Main ends");

	}

	protected static void method2() {
		_log.debug("This is method2()");
		System.out.println("Substracting: " + (10 - 5));
		_log.info("Calling stringutil");
		String filteredString = StringUtil.removeSpecialCharacters("Dhi*r-a%j");
		System.out.println("Got filtered stirng: "+filteredString);

		_log.info("method2() completed");

	}

}
