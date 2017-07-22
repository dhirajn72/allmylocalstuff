package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.core.command.LoginCommand;
import com.spring.validation.LoginCommandValidation;
import com.spring.validation.exception.StudentNotFoundException;

@Controller
public class LoginController {

	@Autowired
	LoginCommandValidation loginCommandValidation;

	String page = "login";

	@RequestMapping(value = "/login")
	public String login(Map<String, Object> model) {
		LoginCommand loginCommand = new LoginCommand();
		model.put("loginCommand", loginCommand);
		return page;
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	@ExceptionHandler({ StudentNotFoundException.class })
	public String loginSubmit(
			@ModelAttribute("loginCommand") LoginCommand loginCommand,
			Errors errors, HttpServletRequest httpServletRequest) {
		loginCommandValidation.validate(loginCommand, errors);
		if (errors.hasErrors()) {
			return page;
		}

		String sid = loginCommand.getSid();
		if (sid.equals("JLC-99")) {
			System.out.println(sid);
		} else {
			httpServletRequest.setAttribute("loginCommand", loginCommand);
			throw new StudentNotFoundException(sid);
		}
		page = "home";
		return page;
	}

}
