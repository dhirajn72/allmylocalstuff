package com.java8.core;

@FunctionalInterface
interface Fly {
	abstract void fly();
	
	default void fly(int a) {
		System.out.println("Fly-fly()");
	};
	default void fly(String a) {
		System.out.println("Fly-fly()");
	};
/*
	default void cruise() {
		System.out.println("Fly-cruise()");
	};

	default void land() {
		System.out.println("Fly-land()");
	};
*/
}

class FlySub implements Fly {
/*	@Override
	public void land() {
		System.out.println("FlySub-land()");
	}
*/
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Test4 {
	public static void main(String[] args) {
		/*FlySub flySub = new FlySub();
		flySub.cruise();
		flySub.land();
		flySub.fly();*/

	}
}
