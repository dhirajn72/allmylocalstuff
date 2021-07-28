/**
 * 
 */
package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.commad.Student;
import com.spring.commad.StudentCommand;
import com.spring.commad.StudentCommandValidator;

/**
 * @author Dhiraj Kumar
 * @website www.facebook.com/dhiraj.singh.90
 */
@Controller
public class MainController {

	@Autowired
	StudentCommandValidator studentCommandValidator;

	@RequestMapping("/searchSid")
	public String showSearchPage(Map<String, Object> map) {
		StudentCommand studentCommand = new StudentCommand();
		map.put("studentCommand", studentCommand);
		return "searchPage";
	}

	@RequestMapping(value = "/sidSubmit", method = RequestMethod.POST)
	@ExceptionHandler({ StudentNotFoundException.class })
	public String sidSubmit(
			@ModelAttribute("studentCommand") StudentCommand studentCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		String page = "";

		studentCommandValidator.validate(studentCommand, bindingResult);

		if (bindingResult.hasErrors()) {
			//page = ;
			return "searchPage";
		}
		String sid = studentCommand.getSid();
		if (sid.equals("JLC-99")) {
			Student st = new Student();
			st.setSid(sid);
			st.setSname("Dhiraj");
			st.setEmail("dhiraj@gmail.com");
			st.setPhone("12345");
			st.setAge("25");
			httpServletRequest.setAttribute("ST", st);
			page = "home";
		} else {
			httpServletRequest.setAttribute("studentCommand", studentCommand);
			throw new StudentNotFoundException(sid);
		}
		return page;
	}

}
