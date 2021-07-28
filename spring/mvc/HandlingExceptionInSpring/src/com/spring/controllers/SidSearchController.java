package com.spring.controllers;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.commands.SidNotFoundException;
import com.spring.commands.SidSearchCommand;
import com.spring.to.StudentTO;
import com.spring.validator.SidValidator;

@Controller
public class SidSearchController {

	@Autowired
	private SidValidator sidValidator;

	@RequestMapping("/sidsearch")
	public String showSearchPage(Map map) throws ServletException {
		SidSearchCommand sidSearchCommand = new SidSearchCommand();
		map.put("sidSearchCommand", sidSearchCommand);
		return "sidsearch";
	}

	@RequestMapping(value = "/searchStudent", method = RequestMethod.POST)
	public String searchStudent(
			@ModelAttribute("sidSearchCommand") SidSearchCommand sidSearchCommand,
			Errors errors, HttpServletRequest httpServletRequest) {

		sidValidator.validate(sidSearchCommand, errors);
		if (errors.hasErrors()) {
			return "sidsearch";
		}
		String result = "";
		String sid = sidSearchCommand.getSid();
		if (sid.equals("JLC-99")) {
			StudentTO to = new StudentTO();
			to.setCid(sid);
			to.setCname("DK");
			to.setEmail("dk@gmail.com");
			to.setPhone("12345");
			httpServletRequest.setAttribute("TO", to);
			result = "success";

		} else {
			httpServletRequest.setAttribute("sidSearchCommand",
					sidSearchCommand);
			throw new SidNotFoundException(sid);
		}

		return result;
	}
}
