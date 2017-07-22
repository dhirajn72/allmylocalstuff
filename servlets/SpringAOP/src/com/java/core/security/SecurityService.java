package com.java.core.security;

import org.aspectj.lang.ProceedingJoinPoint;

public class SecurityService {
	public void verifyUser(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		System.out.println("verifyUser()-starts");
		proceedingJoinPoint.proceed();
		System.out.println("verifyUser()-ends");
	}

	public void verifyPassword() {
		System.out.println("verifyPassword()");
	}

}
