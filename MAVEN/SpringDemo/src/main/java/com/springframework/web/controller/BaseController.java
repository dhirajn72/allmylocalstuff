package com.springframework.web.controller;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hibernate.dao.CustomerDAO;
import com.hibernate.to.CustomerTO;
import com.springframework.web.command.CidCommand;
import com.springframework.web.command.CustomerCommand;
import com.springframework.web.command.validations.CidCommandValidation;
import com.springframework.web.command.validations.CustomerCommandValidation;
import com.springframework.web.controller.exceptions.CustomerNotAvailable;
import com.springframework.web.controller.exceptions.CustomerNotFound;

@Controller
public class BaseController {

	@Autowired
	CustomerCommandValidation customerCommandValidation;

	@Autowired
	CustomerDAO dao;

	@Autowired
	CidCommandValidation cidCommandValidation;

	@RequestMapping("/home.do")
	public String home(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse ) {
		
		Cookie cookie=new Cookie("CTFL", "QWERTY12345QWERTY");
		cookie.setSecure(true);
		cookie.setHttpOnly(true);
		httpServletResponse.addCookie(cookie);
		return "HomeDef";
	}

	@RequestMapping(value = "/addCustomer.do", method = RequestMethod.GET)
	public String addCustomer(Map<String, Object> model) {
		CustomerCommand customerCommand = new CustomerCommand();
		model.put("customerCommand", customerCommand);
		return "AddCustDef";
		
	}

	@RequestMapping(value = "/addCustomerSubmit.do", method = RequestMethod.POST)
	public String homeSubmit(
			@ModelAttribute("customerCommand") CustomerCommand command,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		customerCommandValidation.validate(command, bindingResult);
		if (bindingResult.hasErrors()) {
			return "AddCustDef";
		}

		CustomerTO to = new CustomerTO(command.getCname(), command.getEmail(),
				command.getPhone(), Integer.parseInt(command.getAge()));
		int x = dao.addCustomer(to);
		httpServletRequest.setAttribute("ID", x);
		return "AddSuccessDef";
	}

	@RequestMapping("/deleteCustomer.do")
	public String delete(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);
		return "DeleteCust";
	}

	@RequestMapping(value = "/cidDeleteSubmit.do", method = RequestMethod.POST)
	public String cidDeleteSubmit(
			@ModelAttribute("cidCommand") CidCommand cidCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {

		cidCommandValidation.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "DeleteCust";
		}
		try {
			dao.deleteCustomer(Integer.parseInt(cidCommand.getCid()));
		} catch (Exception e) {
			httpServletRequest.setAttribute("cidCommand", cidCommand);
			throw new CustomerNotFound(cidCommand.getCid());

		}
		return "DeleteSuccess";
	}

	@RequestMapping("/searchCustomer.do")
	public String search(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);
		return "CustSearch";
	}

	@RequestMapping(value = "/cidSearchSubmit.do", method = RequestMethod.POST)
	public String cidSearcSubmit(
			@ModelAttribute("cidCommand") CidCommand cidCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest,
			HttpSession httpSession) {

		cidCommandValidation.validate(cidCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "CustSearch";
		}
		try {
			CustomerTO to = dao.searchCustomer(Integer.parseInt(cidCommand
					.getCid()));
			CustomerCommand command = new CustomerCommand(String.valueOf(to
					.getCid()), to.getCname(), to.getEmail(), to.getPhone(),
					String.valueOf(to.getAge()));
			httpSession.setAttribute("TO", command);
			httpServletRequest.setAttribute("EDIT", "TRUE");
		} catch (Exception e) {
			e.printStackTrace();
			httpServletRequest.setAttribute("cidCommand", cidCommand);
			throw new CustomerNotAvailable(cidCommand.getCid());
		}
		return "SearchSuccess";
	}

	@RequestMapping("/updateCustomer.do")
	public String updateCust(Map<String, Object> model,
			HttpServletRequest httpServletRequest) {
		CustomerCommand customerCommand = new CustomerCommand();
		model.put("customerCommand", customerCommand);
		httpServletRequest.setAttribute("EDIT", "FALSE");
		return "UpdateDef";
	}

	@RequestMapping(value = "/updateSubmit.do", method = RequestMethod.POST)
	public String updateSubmit(
			@ModelAttribute("customerCommand") CustomerCommand customerCommand,
			BindingResult bindingResult) {

		customerCommandValidation.validate(customerCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			return "UpdateDef";
		}

		CustomerTO to = new CustomerTO(Integer.parseInt(customerCommand
				.getCid()), customerCommand.getCname(),
				customerCommand.getEmail(), customerCommand.getPhone(),
				Integer.parseInt(customerCommand.getAge()));
		dao.updateCustomer(to);
		return "UpdateSuccessDef";
	}

}
