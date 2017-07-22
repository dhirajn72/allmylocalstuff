package com.spring.controllers;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.commands.SearchCommand;
import com.spring.validator.SearchSidValidator;

@Controller
public class SearchController {

	@Autowired
	SearchSidValidator searchSidValidator;

	@RequestMapping("/searchStudents")
	public String showSearchPage(Map<String, Object> map) {
		SearchCommand searchCommand = new SearchCommand();
		map.put("searchCommand", searchCommand);
		return "SearchSidDef";
	}

	@RequestMapping(value = "/searchSubmit", method = RequestMethod.POST)
	public String sidSubmit(
			@ModelAttribute("searchCommand") SearchCommand searchCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		return null;

	}

}
