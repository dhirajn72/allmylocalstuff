package com.java.core.wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test3 {
	public static void main(String[] args) {
		long phone = 974385449;
		System.out.println(Long.MAX_VALUE);

		long l = 9223372036854775807l;
		long l2 = 100;
		long res = l + l2;
		System.out.println(res);

		BigInteger b1 = new BigInteger("9223372036854775807");
		BigInteger b2 = new BigInteger("100");
		BigInteger res1 = b1.add(b2);
		System.out.println(res1);
		System.out.println("****************");
		BigDecimal bigDecimal = new BigDecimal(Double.MAX_VALUE);
		System.out.println(bigDecimal);
		System.out.println("********************");
		BigDecimal bigDecimal2=new BigDecimal(Double.POSITIVE_INFINITY);
		System.out.println(bigDecimal2);

	}
}
