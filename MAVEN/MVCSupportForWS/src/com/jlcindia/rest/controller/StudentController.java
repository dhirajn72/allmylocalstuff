package com.jlcindia.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jlcindia.rest.to.StudentTo;
import com.jlcindia.rest.to.Students;

@Controller
// @RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	public String getStudent(@PathVariable int id, ModelMap model) {
		System.out.println("in getStudent()");
		StudentTo st = new StudentTo(id, "sri", "sri@jlc.com", 99999);
		model.addAttribute("STUD", st);
		return "index";
	}

	@RequestMapping(value = "/add/{name}/{email}/{phone}", method = RequestMethod.POST)
	public String addStudent(@PathVariable String name,
			@PathVariable String email, @PathVariable long phone, ModelMap model) {
		System.out.println("in addStudent()");
		StudentTo to = new StudentTo(222, name, email, Integer.valueOf(phone
				+ ""));
		System.out.println("in server:" + to);
		model.addAttribute("ADDED", "Student info added successfulyy");
		return "index";
	}

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public String getAllStudent(ModelMap model) {
		System.out.println("in getAllStudent()");

		List<StudentTo> tos = new ArrayList<StudentTo>();
		tos.add(new StudentTo(1, "mk", "mk@gmail.com", 99999));
		tos.add(new StudentTo(2, "dk", "dk@gmail.com", 5555));
		tos.add(new StudentTo(3, "mk", "sk@gmail.com", 7777));
		tos.add(new StudentTo(4, "sk", "sk@gmail.com", 8888));
		tos.add(new StudentTo(5, "ck", "ck@gmail.com", 887777));

		Students list = new Students();
		list.setStudentTos(tos);
		model.addAttribute("LIST", list);
		return "index";
	}
}
