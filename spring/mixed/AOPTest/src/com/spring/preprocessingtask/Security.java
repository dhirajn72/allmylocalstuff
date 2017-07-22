package com.spring.preprocessingtask;

import org.aspectj.lang.ProceedingJoinPoint;

public class Security {
	public void verifyUser(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Security-verifyUser()-starts");
		joinPoint.proceed();
		System.out.println("Security-verifyUser()-ends");
	}

	public void verifiedUser(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Security-verifiedUser()-starts");
		joinPoint.proceed();
		System.out.println("Security-verifiedUser()-ends");
	}

}
