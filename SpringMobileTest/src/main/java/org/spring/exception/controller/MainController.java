package org.spring.exception.controller;

import javax.servlet.http.HttpServletRequest;

import org.spring.exception.bean.SidSearchCommand;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "sidSearchCommand" })
public class MainController {

	/*
	 * @RequestMapping(value = "/search") public String
	 * loadHome(HttpServletRequest request, HttpServletResponse response) {
	 * System.out.println("loadHome() called"); SidSearchCommand
	 * sidSearchCommand = new SidSearchCommand();
	 * request.setAttribute("sidSearchCommand", sidSearchCommand); return
	 * "searchStudent"; }
	 */

	@RequestMapping(value = "/search")
	public String loadHome(Model model, /*Device device,*/
			HttpServletRequest request) {
		System.out.println("loadHome() called");
		String view = "searchStudent";
		SidSearchCommand sidSearchCommand = new SidSearchCommand();
		model.addAttribute("sidSearchCommand", sidSearchCommand);
		System.out.println(model);
		/* System.out.println(device); */
		System.out.println(DeviceUtils.getCurrentDevice(request));
		System.out.println("*******************************************");

		return "searchStudent";
	}

	@RequestMapping(value = "/searchBySID", method = RequestMethod.POST)
	@ExceptionHandler({ SIDNotFoundException.class })
	public String searchStudent(
			@ModelAttribute("sidSearchCommand") SidSearchCommand sidSearchCommand,
			BindingResult bindingResult, ModelMap model,
			HttpServletRequest request) {
		System.out.println("searchStudent() called");
		String sid = sidSearchCommand.getSid();

		System.out.println(sid);
		if (!sid.equals("909")) {
			request.setAttribute("sidSearchCommand", sidSearchCommand);
			throw new SIDNotFoundException(sid);
		}
		return "success";
	}
	/*
	 * @RequestMapping(value = "/searchStudent", method = RequestMethod.POST)
	 * public String searchStudent(HttpServletRequest
	 * request,HttpServletResponse response) {
	 * System.out.println("searchStudent() called"); String sid=
	 * request.getParameter("sid");
	 * 
	 * System.out.println(sid);
	 * 
	 * return "success"; }
	 */
}
