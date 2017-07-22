package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.SidSearchCommand;
import com.spring.exception.SidNotFoundException;
import com.spring.service.StudentService;
import com.spring.to.StudentTO;
import com.spring.validator.SidValidator;

@Controller
public class MainController {

	@Autowired
	SidValidator sidValidator;

	@Autowired
	StudentService studentService;

	@RequestMapping("/sidSearch")
	public String showSearchPage(Map<String, Object> map) {
		SidSearchCommand sidSearchCommand = new SidSearchCommand();
		map.put("sidSearchCommand", sidSearchCommand);
		return "searchPage";
	}

	@RequestMapping(value = "/sidSubmit", method = RequestMethod.POST)
	public String sidRecieved(
			@ModelAttribute("sidSearchCommand") SidSearchCommand sidSearchCommand,
			Errors errors, HttpServletRequest servletRequest) {

		sidValidator.validate(sidSearchCommand, errors);
		if (errors.hasErrors()) {
			return "searchPage";
		}
		String result = "";
		String sid = sidSearchCommand.getSid();
		StudentTO studentTO = null;
		try {
			studentTO = studentService.getStudentBySid(sid);
		} catch (Exception e) {
			servletRequest.setAttribute("sidSearchCommand", sidSearchCommand);
			throw new SidNotFoundException(sid);

		}
		if (sid.equals(studentTO.getCid())) {
			servletRequest.setAttribute("TO", studentTO);
			result = "success";
		} else {
			servletRequest.setAttribute("sidSearchCommand", sidSearchCommand);
			throw new SidNotFoundException(sid);
		}

		return result;
	}
}
