package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("EmployeeServlet-service()-starts");
		HttpServletRequest httpServletRequest = (HttpServletRequest) req;
		System.out.println(httpServletRequest.getContextPath());
		System.out.println(httpServletRequest.getRequestURL());
		System.out.println(httpServletRequest.getAuthType());
		System.out.println(httpServletRequest.getLocalPort());
		System.err.println("****config params********");
		ServletConfig servletConfig = getServletConfig();
		Enumeration<String> enumeration = servletConfig.getInitParameterNames();
		ArrayList list = Collections.list(enumeration);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object val = it.next();
			String val1 = servletConfig.getInitParameter(val.toString());
			System.err.println("Servletconfig parameters:" + val1);
		}
		System.err.println("*************");
		System.out
				.println("invoking request dispatcher from EmployeeServlet again");
		RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
		System.out.println("invoked request dispatcher from EmployeeServlet");
		System.out.println("EmployeeServlet-service()-ends");

	}

}
