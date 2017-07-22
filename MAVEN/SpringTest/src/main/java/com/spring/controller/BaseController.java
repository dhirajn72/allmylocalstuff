package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.command.CustomerCommand;

@Controller
public class BaseController {

	@RequestMapping("/home.do")
	public String home(Map<String, Object> model) {
		CustomerCommand customerCommand = new CustomerCommand();
		model.put("customerCommand", customerCommand);
		return "home";
	}

	@RequestMapping("/home.do")
	public String homeSubmit(
			@ModelAttribute("customerCommand") CustomerCommand command,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		CustomerCommand customerCommand = new CustomerCommand();

		System.out.println(command.getCid());
		System.out.println(command.getCname());
		System.out.println(command.getEmail());
		System.out.println(command.getPhone());
		System.out.println(command.getAge());

		return "success";
	}

}
