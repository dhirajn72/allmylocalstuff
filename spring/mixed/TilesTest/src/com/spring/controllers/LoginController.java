package com.spring.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.commands.AddStudentCommand;
import com.spring.commands.LoginCommand;
import com.spring.validator.AddStudentCommandValidator;

@Controller
public class LoginController {

	@Autowired
	AddStudentCommandValidator addStudentCommandValidator;

	@RequestMapping("/home")
	public String showLoginPage(Map<String, Object> map) {
		LoginCommand loginCommand = new LoginCommand();
		map.put("loginCommand", loginCommand);
		return "HomeDef";
	}

	@RequestMapping("/addStudents")
	public String addStudent(Map<String, Object> map) {
		AddStudentCommand addStudentCommand = new AddStudentCommand();
		map.put("addStudentCommand", addStudentCommand);
		return "AddStudent";
	}

	@RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	public String dataSubmit(
			@ModelAttribute("addStudentCommand") AddStudentCommand addStudentCommand,
			Errors errors, HttpServletRequest httpServletRequest, Model model) {

		addStudentCommandValidator.validate(addStudentCommand, errors);
		if (errors.hasErrors()) {
			return "AddStudent";
		}
		System.out.println(addStudentCommand.getSid());
		System.out.println(addStudentCommand.getSname());
		System.out.println(addStudentCommand.getEmail());
		System.out.println(addStudentCommand.getPhone());

		return "AddStudentSuccess";
	}

}
