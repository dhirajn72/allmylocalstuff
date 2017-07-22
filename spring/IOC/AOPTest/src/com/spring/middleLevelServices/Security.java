package com.spring.middleLevelServices;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Security {

	@Pointcut(value = "execution(* com.spring.bussiness.Account.depo*(..))")
	public void check1() {

	}

	@Pointcut(value = "execution(* com.spring.bussiness.Transaction.*(..))")
	public void check3() {

	}

	@Before("check1()")
	public void verifyUser() {
		System.out.println("verifyUser()");
	}

	@AfterThrowing("check1()")
	public void handlingErrors() {
		System.out.println("handlingErrors()");
		System.out.println("error caught");
	}

	/*
	 * //@AfterReturning("check2()") public void done() {
	 * System.out.println("done successfully"); }
	 */

	/*
	 * //@Around("check3()") public void success(ProceedingJoinPoint pjp) throws
	 * Throwable { System.out.println("success() starts"); pjp.proceed();
	 * System.out.println("success() ends");
	 * 
	 * }
	 */

}
