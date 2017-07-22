package com.rest.ws;

import java.util.List;

import org.springframework.web.client.RestTemplate;

public class Client {
	public static void main(String[] args) {
		RestTemplate client1 = new RestTemplate();
		Customers c = client1.getForObject(
				"http://localhost:8080/RestWS-Spring/rest/getAll",
				Customers.class);
		List<Customer> list = c.getList();
		for (Customer c2 : list) {
			System.out.println(c2);
		}

	}
}
