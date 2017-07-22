package com.aci.training;


public class ClienTest {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AccountService ac = (AccountService) ctx.getBean("accountService");
		ac.withdraw();

	}
}
