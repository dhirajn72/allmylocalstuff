package com.java.core.security;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingService {
	public void logging(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("logging()-starts");
		proceedingJoinPoint.proceed();
		System.out.println("logging()-ends");
	}
}
