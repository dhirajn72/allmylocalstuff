package com.spring.handler.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String showHello(Map<String, Object> map) {
		System.out.println("showHello()");
		return "hello";
	}

	@RequestMapping("/hai")
	public String showHai(Map<String, Object> map) {
		System.out.println("showHai()");
		return "hai";
	}

}
