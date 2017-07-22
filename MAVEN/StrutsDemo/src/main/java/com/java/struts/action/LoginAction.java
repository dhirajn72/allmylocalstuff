package com.java.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.struts.LoginForm;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm lf = (LoginForm) form;
		String un = lf.getUsername();
		String ps = lf.getPassword();
		System.out.println("DB Codes");
		String result = "";
		if (un.equals(ps)) {
			result = "home";
		} else {
			result = "login";
		}
		return mapping.findForward(result);
	}
}
