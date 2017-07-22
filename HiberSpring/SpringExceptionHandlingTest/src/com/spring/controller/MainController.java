package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;
import com.spring.command.CidCommand;
import com.spring.command.CustomerCommand;
import com.spring.validation.CidCommandValidation;
import com.spring.validation.CustomerCommandValidation;
import com.spring.validation.exceptions.CustomerNotFound;
import com.spring.validation.exceptions.CustomerNotFoundException;

@Controller
public class MainController {

	@Autowired
	CustomerCommandValidation customerCommandValidation;

	@Autowired
	CustomerDAO dao;

	@Autowired
	CidCommandValidation cidCommandValidation;

	@RequestMapping("/addCustomer.do")
	public String home(Map<String, Object> model) {
		CustomerCommand customerCommand = new CustomerCommand();
		model.put("customerCommand", customerCommand);
		return "home";
	}

	@RequestMapping(value = "/registerSubmit.do", method = RequestMethod.POST)
	public String register(
			@Valid @ModelAttribute("customerCommand") CustomerCommand customerCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		customerCommandValidation.validate(customerCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "home";
		}
		CustomerTO to = new CustomerTO(customerCommand.getCname(),
				customerCommand.getEmail(), customerCommand.getPhone(),
				Integer.parseInt(customerCommand.getAge()));
		int x = dao.addCustomer(to);
		httpServletRequest.setAttribute("ID", x);
		return "addSuccess";
	}

	@RequestMapping("/deleteCustomer.do")
	public String deleteCust(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);
		return "enterCid";
	}

	@RequestMapping("/cidSubmit.do")
	public String cidSubmit(
			@ModelAttribute("cidCommand") CidCommand cidCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		cidCommandValidation.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "enterCid";
		}
		try {
			dao.deleteCustomer(Integer.parseInt(cidCommand.getCid()));
		} catch (Exception e) {
			httpServletRequest.setAttribute("cidCommand", cidCommand);
			throw new CustomerNotFoundException(cidCommand.getCid());
		}
		return "deleteSuccess";
	}

	@RequestMapping("/searchCustomer.do")
	public String updateCustomer(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);

		return "updateCust";
	}

	@RequestMapping("/cidUpdate.do")
	public String cidUpdate(
			@ModelAttribute("cidCommand") CidCommand cidCommand,
			BindingResult bindingResult, Map<String, Object> model,
			HttpSession httpSession, HttpServletRequest httpServletRequest) {
		// Map<String, Object> model
		cidCommandValidation.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "updateCust";
		}
		try {
			CustomerTO to = dao.getCustomer(Integer.parseInt(cidCommand
					.getCid()));
			CustomerCommand customerCommand = new CustomerCommand(to.getCid()
					+ "", to.getCname(), to.getEmail(), to.getPhone(),
					to.getAge() + "");
			model.put("customerCommand", customerCommand);
			httpSession.setAttribute("CTO", to);
			httpSession.setAttribute("EDIT", "TRUE");

		} catch (Exception e) {
			httpServletRequest.setAttribute("cidCommand", cidCommand);
			throw new CustomerNotFound(cidCommand.getCid());
		}
		return "updateCustomer";
	}

	@RequestMapping(value = "/updateSubmit.do", method = RequestMethod.POST)
	public String updateSubmit(
			@ModelAttribute("customerCommand") CustomerCommand customerCommand,
			BindingResult bindingResult, HttpSession httpSession) {

		customerCommandValidation.validate(customerCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "updateCustomer";
		}
		CustomerTO to = new CustomerTO(Integer.parseInt(customerCommand
				.getCid()), customerCommand.getCname(),
				customerCommand.getEmail(), customerCommand.getPhone(),
				Integer.parseInt(customerCommand.getAge()));
		dao.updateCustomer(to);
		return "updateSuccess";
	}

	@RequestMapping("/editContact.do")
	public String editContact(Map<String, Object> model, HttpSession httpSession) {
		CustomerCommand customerCommand = new CustomerCommand();
		model.put("customerCommand", customerCommand);
		httpSession.setAttribute("EDIT", "FALSE");
		return "updateCustomer";
	}

}
