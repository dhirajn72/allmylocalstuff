package com.java.core.JUnitTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestAll {
	public static Test testSuit() {
		System.out.println("testSuit()");
		TestSuite ts = new TestSuite();
		ts.addTestSuite(JunitTestForMathTest.class);
		return ts;

	}
}
