package com.spring.postprocessors;

public class MyBean implements MyBeanPostProcessor {
	int a;
	String s;

	public MyBean(int a, String s) {
		super();
		this.a = a;
		this.s = s;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public void myPostProcessBeforeInit() {
		System.out.println("MyBean->>myPostProcessBeforeInit()");
	}

}
