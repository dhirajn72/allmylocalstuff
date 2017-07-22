package com.spring.oxm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.oxm.Account;
import com.spring.oxm.Customer;
import com.spring.oxm.Customers;
import com.spring.oxm.MainMarshaller;

public class MarshallingTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MainMarshaller mainMarshaller = (MainMarshaller) applicationContext
				.getBean("mainMarshaller");
		Account account = new Account("SBI-001", 10000, "CA");
		Customer customer = new Customer(101, "Singh", "singh@gmail.com",
				"9743854499", account);
		Customers customers = new Customers();
		customers.addCustomer(customer);
		customers.addCustomer(customer);
		customers.addCustomer(customer);

		mainMarshaller.save(customers, "src/customers.xml");
		System.out.println("Check src directory");

	}

}
