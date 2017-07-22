package com.spring.preprocessingtask;

public class Security {
	public void verifyUser() {
		System.out.println("Security-verifyUser()-starts");
		// joinPoint.proceed();
		System.out.println("Security-verifyUser()-ends");
	}

	public void verifiedUser() {
		System.out.println("Security-verifiedUser()-starts");
		// joinPoint.proceed();
		System.out.println("Security-verifiedUser()-ends");
	}

}
