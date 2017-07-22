package com.java8.features1;

public class Test1 {
	
	

	Runnable runnable = () -> {

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out
				.println(Thread.currentThread().getUncaughtExceptionHandler());

	};

}


