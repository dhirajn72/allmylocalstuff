package com.spring.mvc.controller;

import java.util.Map;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.command.ContactCommand;
import com.spring.mvc.command.validator.ContactCommandValidator;

@Controller
public class LoginController {

	static Logger log = Logger.getLogger(LoginController.class);
	static {
		BasicConfigurator.configure();
		}

	@Autowired
	ContactCommandValidator contactCommandValidator;

	@RequestMapping("/login")
	public String showLogin(Map<String, Object> map) {
		log.info("showLogin(Map  map) called");
		log.info("storing command object in map");
		ContactCommand contactCommand = new ContactCommand();
		map.put("contactCommand", contactCommand);

		log.info("returning from showLogin(Map  map) ");
		return "login";
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String loginSubmit(
			@ModelAttribute("contactCommand") ContactCommand contactCommand,
			BindingResult bindingResult, Model model) {
		log.info("loginSubmit() called");
		log.info("calling validator to validate command data");

		contactCommandValidator.validate(contactCommand, bindingResult);

		log.info("validation done");

		if (bindingResult.hasErrors()) {
			return "login";
		}
		log.info("gettign data from command");
		log.info("interacting with DB");

		System.out.println(contactCommand.getId());
		System.out.println(contactCommand.getName());
		System.out.println(contactCommand.getEmail());
		System.out.println(contactCommand.getPhone());
		System.out.println(contactCommand.getDob());

		log.info("storing command object in model");
		model.addAttribute("CTO", contactCommand);
		log.info("returning from loginSubmit() ");

		return "home";
	}

}
