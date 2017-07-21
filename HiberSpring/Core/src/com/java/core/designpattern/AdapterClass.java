package com.java.core.designpattern;

public class AdapterClass {

	Test1 test1;
	Test2 test2;

	public AdapterClass() {
		test1 = new Test1();
		test2 = new Test2();
	}

	public Object methods(int a) {
		if (a == 1)
			return test1;
		return test2;

	}

}
