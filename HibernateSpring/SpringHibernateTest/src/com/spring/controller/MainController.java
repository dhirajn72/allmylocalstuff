package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.integrationLayer.CustomerService;
import com.spring.command.Customer;
import com.spring.command.CidCommand;
import com.spring.exception.CustomerNotFoundException;
import com.spring.to.CustomerTO;
import com.spring.validator.CustomerValidator;
import com.spring.validator.EmailCommandValidator;

@Controller
public class MainController {

	@Autowired
	CustomerValidator customerValidator;

	@Autowired
	CustomerService customerService;

	@Autowired
	EmailCommandValidator emailCommandValidator;

	@RequestMapping("/home.do")
	public String home(Map<String, Object> model) {
		Customer customer = new Customer();
		model.put("customer", customer);
		return "customerData";
	}

	@RequestMapping(value = "/customerDataSubmit.do", method = RequestMethod.POST)
	public String customerDataSubmit(@ModelAttribute("customer") Customer cust,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		customerValidator.validate(cust, bindingResult);
		if (bindingResult.hasErrors()) {
			return "customerData";
		}
		CustomerTO to = new CustomerTO(cust.getCname(), cust.getEmail(),
				cust.getPhone(), cust.getAge(), cust.getCompany(),
				cust.getCity());

		int cid = customerService.addCustomer(to);
		httpServletRequest.getSession().setAttribute("ID", cid);
		return "successDef";
	}

	@RequestMapping(value = "/viewData.do")
	public String updateData(Map<String, Object> model) {
		CidCommand cidCommand = new CidCommand();
		model.put("cidCommand", cidCommand);
		return "updateData";
	}

	@RequestMapping(value = "/updateSubmit.do", method = RequestMethod.POST)
	@ExceptionHandler({ CustomerNotFoundException.class })
	public String updateSubmit(
			@ModelAttribute("cidCommand") CidCommand emailCommand,
			BindingResult bindingResult, HttpServletRequest httpServletRequest) {
		String id = httpServletRequest.getSession().getAttribute("ID")
				.toString();
		System.out.println("String->" + id);
		try {
			int x = Integer.parseInt(id);
			System.out.println("int->" + x);
			emailCommand.setCid(x);
		} catch (Exception e) {
			httpServletRequest.setAttribute("CIDERR", "Enter digits only");
			throw new CustomerNotFoundException();
		}
		emailCommandValidator.validate(emailCommand, bindingResult);
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getAllErrors());
			return "updateData";
		}

		int cid = emailCommand.getCid();
		try {
			CustomerTO to = customerService.getCustomerByCid(cid);
			HttpSession httpSession = httpServletRequest.getSession();
			httpSession.setAttribute("CTO", to);
			httpSession.setAttribute("EDIT", "FALSE");
		} catch (Exception e) {
			httpServletRequest.setAttribute("cidCommand", emailCommand);
			throw new CustomerNotFoundException(cid);
		}
		return "success";
	}

	@RequestMapping(value = "/update.do")
	public String editData(Map<String, Object> model, HttpSession httpSession) {
		CustomerTO to = (CustomerTO) httpSession.getAttribute("CTO");
		Customer customer = new Customer(to.getCname(), to.getEmail(),
				to.getPhone(), to.getAge(), to.getCompany(), to.getCity());
		model.put("customer", customer);
		System.out.println("sesion object:-" + httpSession);
		httpSession.setAttribute("EDIT", "TRUE");
		return "success";
	}
	/*
	 * @RequestMapping(value = "/customerUpdate.do", method =
	 * RequestMethod.POST) public String
	 * customerUpdate(@ModelAttribute("customer") Customer cust, BindingResult
	 * bindingResult) { customerValidator.validate(cust, bindingResult);
	 * 
	 * if (bindingResult.hasErrors()) { return "success"; } CustomerTO to = new
	 * CustomerTO(cust.getCname(), cust.getEmail(), cust.getPhone(),
	 * cust.getAge(), cust.getCompany(), cust.getCity());
	 * 
	 * int cid = customerService.updateCustomer(to);
	 * httpServletRequest.setAttribute("ID", cid); return "successDef";
	 * 
	 * return null; }
	 */

}
