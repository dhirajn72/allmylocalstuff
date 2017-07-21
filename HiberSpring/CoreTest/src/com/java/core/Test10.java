package com.java.core;

public class Test10 {
	public static void main(String[] args) {
		Address address = new Address(101, "palya", 560097);
		ImmutableClassEmployee immutableClassEmployee = new ImmutableClassEmployee(
				88, "dk", "dk@gmail.com", 9754339998l, address);
		System.out.println(immutableClassEmployee);
		Address address2 = immutableClassEmployee.getAddress();
		Address address3 = immutableClassEmployee.getAddress();
		System.out.println(address2 == address3);

	}
}
