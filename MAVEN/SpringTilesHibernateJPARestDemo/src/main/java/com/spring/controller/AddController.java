package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring.command.CustomerCommand;
import com.spring.command.validations.CustomerCommandValidator;

@Controller
@SessionAttributes
public class AddController {

	@Autowired
	CustomerCommandValidator ccv;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addCredentials(Map<String, Object> model) {
		CustomerCommand cc = new CustomerCommand();
		model.put("CC", cc);
		return "AddDef";
	}

	@RequestMapping(value = "/addSubmit", method = RequestMethod.POST)
	public String addSubmit(@ModelAttribute("CC") CustomerCommand cc,
			BindingResult br, Model m) {
		ccv.validate(cc, br);
		if (br.hasErrors()) {
			return "AddDef";
		}
//		System.out.println("implement service layer");
		
		
		
		
		

		return "AddSuccessDef";
	}
}
