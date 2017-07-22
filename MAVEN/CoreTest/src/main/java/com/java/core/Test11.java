package com.java.core;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test11 {
	public static void main(String[] args) throws Exception {
		Sub sub = new Sub(99, "dk", 88, "singh");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("src/main/resources/data.ser"));
		objectOutputStream.writeObject(sub);
		System.out.println("Done !!");

	}
}

class Super {
	public int a;
	public String str;

	public Super() {
		// TODO Auto-generated constructor stub
	}

	public Super(int a, String str) {
		super();
		this.a = a;
		this.str = str;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}

class Sub extends Super implements Serializable {
	public int y;
	public String msg;

	public Sub() {
		// TODO Auto-generated constructor stub
	}

	public Sub(int a, String str, int y, String msg) {
		super(a, str);
		this.y = y;
		this.msg = msg;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Sub [y=" + y + ", msg=" + msg + ", a=" + a + ", str=" + str
				+ "]";
	}

}
