package com.spring.rest;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.spring.rest.to.CustomerTO;
import com.spring.rest.to.Customers;

public class Test {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		Customers customers = restTemplate.getForObject(
				"http://localhost:8080/SpringREST-WS/rest/getAll",
				Customers.class);
		List<CustomerTO> tos = customers.getTos();
		for (CustomerTO c : tos) {
			System.out.println(c);
		}

	}

}
