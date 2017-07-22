package com.java.p3;

public class Test1 {

	public static void main(String[] args) {
		Mango mango = new Mango();
		mango.m1();
		Fruit f=new Fruit();
		f=null;
		new Mango().m1();
		System.gc();

	}

}

class Fruit {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Fruit");
	}
}

class Mango {
	public void m1() {
		System.out.println("m1-starts");
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		Fruit fruit3 = new Fruit();
		Fruit fruit4 = new Fruit();
		Fruit fruit5 = new Fruit();
		Fruit fruit6 = new Fruit();
		System.out.println("m1-ends");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Mango");
	}

}