package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.core.command.LoginCommand;
import com.spring.validation.LoginCommandValidation;

@Controller
public class LoginController {

	@Autowired
	LoginCommandValidation loginCommandValidation;

	String page = "login";

	@RequestMapping(value = "/login")
	public String login(Map<String, Object> model) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername("dhiraj");
		model.put("loginCommand", loginCommand);
		return page;
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmit(
			@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Errors errors) {
		loginCommandValidation.validate(loginCommand, errors);
		if (errors.hasErrors()) {
			return page;
		}

		String un = loginCommand.getUsername();
		String ps = loginCommand.getPassword();
		System.out.println(un);
		System.out.println(ps);

		page = "home";
		return page;
	}

}
