package com.java8.core;

public class DeadLock {

	private static Object ob1 = new Object();
	private static Object ob2 = new Object();

	static {
		System.out.println("SB-1 going to aquire lock on object 1");
		synchronized (ob1) {
			System.out.println("SB-1 object 1 locked");
			synchronized (ob2) {
				System.out.println("SB-1 object 2 locked");
			}
		}
	}
	static {
		System.out.println("SB-2 going to aquire lock on onject 2");
		synchronized (ob2) {
			System.out.println("SB-2 object 2 locked");
			synchronized (ob1) {
				System.out.println("SB-2 object 1 locked");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main ends");
	}

}
