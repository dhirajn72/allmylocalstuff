package com.junit.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.model.InitializationError;

@RunWith(value = Parameterized.class)
public class ArithmeticTest1 {
	Arithmetic1 a1;
	int a;
	int b;
	int c;

	public ArithmeticTest1(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Test
	public void testSum() {
		a1 = new Arithmetic1();
		int result = a1.add(a, b);
		Assert.assertEquals(10, result);
		System.out.println("completes");
	}
}
