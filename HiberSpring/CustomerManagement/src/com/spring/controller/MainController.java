package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;
import com.spring.commands.AddCustomerCommand;
import com.spring.commands.CidCommand;
import com.spring.exceptions.CustomerNotAvailableException;
import com.spring.exceptions.CustomerNotFoundException;
import com.spring.validation.AddCustomerCommandValidation;
import com.spring.validation.CidCommandValidator;

@Controller
public class MainController {

	@Autowired
	AddCustomerCommandValidation addCustomerCommandValidation;

	@Autowired
	CustomerDAO dao;

	@Autowired
	CidCommandValidator cidCommandValidator;

	@RequestMapping("/home.do")
	public String homeDef() {
		return "HomeDef";
	}

	@RequestMapping("/addCustomer.do")
	public String showAddCustomerPage(Map<String, Object> model) {
		AddCustomerCommand addCustomerCommand = new AddCustomerCommand();
		model.put("addCustomerCommand", addCustomerCommand);
		return "ShowAddCustomerPage";
	}

	@RequestMapping(value = "/addCustomerSubmit.do", method = RequestMethod.POST)
	public String addCustomerSubmit(
			@ModelAttribute("addCustomerCommand") AddCustomerCommand addCustomerCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		addCustomerCommandValidation
				.validate(addCustomerCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "ShowAddCustomerPage";
		}

		CustomerTO to = new CustomerTO(addCustomerCommand.getCname(),
				addCustomerCommand.getEmail(), addCustomerCommand.getPhone(),
				Integer.parseInt(addCustomerCommand.getAge()));

		int x = dao.addCustomer(to);
		httpServletRequest.setAttribute("ID", x);
		return "AddCustomerSuccess";
	}

	@RequestMapping("/deleteCustomer.do")
	public String deleteCustomer(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);
		return "DeletePage";
	}

	@RequestMapping(value = "/cidDeleteSubmit.do", method = RequestMethod.POST)
	public String deleteCust(
			@ModelAttribute("cidCommand") CidCommand cidCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		cidCommandValidator.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "DeletePage";
		}
		try {
			dao.deleteCustomer(Integer.parseInt(cidCommand.getCid()));

		} catch (Exception e) {
			httpServletRequest.setAttribute("cidCommand", cidCommand);
			throw new CustomerNotFoundException(cidCommand.getCid());
		}
		return "DeleteSuccess";
	}

	@RequestMapping("/searchCustomer.do")
	public String seachCustomerPage(Map<String, Object> model) {
		CidCommand searchCommand = new CidCommand();
		model.put("searchCommand", searchCommand);
		return "SearchCustPage";
	}

	@RequestMapping(value = "/cidSearchSubmit.do", method = RequestMethod.POST)
	public String searchSubmit(
			@ModelAttribute("searchCommand") CidCommand cidCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest,
			HttpSession httpSession) {

		cidCommandValidator.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "SearchCustPage";
		}

		try {
			CustomerTO to = dao.searchCustomer(Integer.parseInt(cidCommand
					.getCid()));
			AddCustomerCommand cust = new AddCustomerCommand(String.valueOf(to
					.getCid()), to.getCname(), to.getEmail(), to.getPhone(),
					String.valueOf(to.getAge()));
			System.out.println(cust);
			httpSession.setAttribute("TO", cust);
		} catch (Exception e) {
			System.out.println("catch called");
			httpServletRequest.setAttribute("searchCommand", cidCommand);
			throw new CustomerNotAvailableException(cidCommand.getCid());
		}
		return "SearchSuccessDef";
	}

	@RequestMapping("/updateCustomer.do")
	public String updateCust(Map<String, Object> model,
			HttpServletRequest httpServletRequest) {
		AddCustomerCommand customerCommand = new AddCustomerCommand();
		model.put("customerCommand", customerCommand);
		return "UpdateCustomerDef";
	}

	@RequestMapping(value = "/updateCustomerSubmit.do ", method = RequestMethod.POST)
	public String updateCustomer(
			@ModelAttribute("customerCommand") AddCustomerCommand addCustomerCommand,
			BindingResult bindingResult) {
		addCustomerCommandValidation
				.validate(addCustomerCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "SearchSuccessDef";
		}
		CustomerTO to = new CustomerTO(Integer.parseInt(addCustomerCommand
				.getCid()), addCustomerCommand.getCname(),
				addCustomerCommand.getEmail(), addCustomerCommand.getPhone(),
				Integer.parseInt(addCustomerCommand.getAge()));
		dao.updateCustomer(to);
		return "UpdateSuccess";
	}
}
