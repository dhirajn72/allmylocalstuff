package com.java.core.JUnitTest;

import junit.framework.TestCase;

public class JunitTestForMathTest extends TestCase {
	MathTest mt = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mt = new MathTest();
		System.out.println("setUp()");
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		mt = null;

		System.out.println("tearDown()");
	}

	public void testAdd() {
		System.out.println("testAdd()");

		int x = mt.add(10, 20);
		assertEquals(30, x);
		x = mt.add(100, 20);
		assertEquals(120, x);
		x = mt.add(1000, 500);
		assertEquals(1500, x);
		x = mt.add(3, 4);
		assertEquals(7, x);
	}

	public void testSub() {
		System.out.println("testSub()");
		int x = mt.sub(10, 20);
		assertEquals(-10, x);
		x = mt.sub(100, 20);
		assertEquals(-80, x);
		x = mt.sub(1000, 500);
		assertEquals(500, x);
		x = mt.sub(3, 4);
		assertEquals(-1, x);
	}
}
