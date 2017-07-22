package com.spring.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.commands.LoginCommand;
import com.spring.validator.LoginValidator;

@Controller
public class MainController {

	@Autowired
	LoginValidator loginValidator;

	@RequestMapping("/home.do")
	public String showHome(Map<String, Object> model) {
		LoginCommand loginCommand = new LoginCommand();
		loginCommand.setUsername("dhiraj");
		model.put("loginCommand", loginCommand);
		return "login";
	}

	@RequestMapping(value = "/loginSubmit.do", method = RequestMethod.POST)
	public String loginSubmit(
			@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Errors errors, HttpServletRequest httpServletRequest) {

		loginValidator.validate(loginCommand, errors);
		if (errors.hasErrors()) {
			return "login";
		}

		System.out.println(loginCommand.getUsername());
		System.out.println(loginCommand.getPassword());

		httpServletRequest.setAttribute("UN", loginCommand.getUsername());
		return "loginSuccess";
	}

	
}
