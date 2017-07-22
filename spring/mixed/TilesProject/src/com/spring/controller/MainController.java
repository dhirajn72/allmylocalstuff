/**
 * 
 */
package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.command.StudentCommand;
import com.spring.validator.StudentCommandValidator;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
@Controller
public class MainController {

	@Autowired
	StudentCommandValidator validator;

	@RequestMapping("/home")
	public String home(Map<String, Object> map) {
		System.out.println("home called");
		return "HomeDef";
	}

	@RequestMapping(value = "/addStudent")
	public String addStudent(Map<String, Object> map) {
		StudentCommand studentCommand = new StudentCommand();
		map.put("studentCommand", studentCommand);
		return "AddStudentDef";
	}

	@RequestMapping(value = "/removeStudent")
	public String removeStudent(Map<String, Object> map) {
		StudentCommand studentCommand = new StudentCommand();
		map.put("studentCommand", studentCommand);
		return "RemoveStudentDef";
	}

	@RequestMapping(value = "/searchStudent")
	public String searchStudent(Map<String, Object> map) {
		StudentCommand studentCommand = new StudentCommand();
		map.put("studentCommand", studentCommand);
		return "SearchStudentDef";
	}

	@RequestMapping(value = "/studentData", method = RequestMethod.POST)
	public String studentData(
			@ModelAttribute("studentCommand") StudentCommand studentCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		System.out.println(studentCommand);
		validator.validate(studentCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "AddStudentDef";
		}
		System.out.println(studentCommand);
		System.out.println(studentCommand.getSid());
		System.out.println(studentCommand.getSname());
		System.out.println(studentCommand.getEmail());
		System.out.println(studentCommand.getPhone());
		System.out.println(studentCommand.getAge());

		return "StudentAddedDef";
	}

}
