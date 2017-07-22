package com.java.servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

	// ServletConfig servletConfig = null;

	/*
	 * @Override public void init(ServletConfig config) throws ServletException
	 * { this.servletConfig = config; // super.init(config);
	 * System.out.println("TestServlet-init()"); }
	 */

	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		String name = httpServletRequest.getParameter("name");
		String email = httpServletRequest.getParameter("email");
		String phone = httpServletRequest.getParameter("phone");
		String dob = httpServletRequest.getParameter("dob");
		String gender = httpServletRequest.getParameter("gender");
		String[] courses = httpServletRequest.getParameterValues("course");
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		System.out.println(dob);
		System.out.println(gender);
		if (courses != null) {
			for (int i = 0; i < courses.length; i++) {
				System.out.println(courses[i]);
			}
		}
		System.out.println("************************************");

		Map<String, Object[]> map = httpServletRequest.getParameterMap();
		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object val = map.get(key);
			String[] vals = (String[]) val;
			for (int i = 0; i < vals.length; i++) {
				System.out.println(key + "->" + vals[i]);
			}

		}

		HttpSession httpSession = httpServletRequest.getSession();
		System.out.println(httpSession.getId());

		System.out.println("********************");
		// String city = getInitParameter("city");// getting data from init() of
		// super class
		ServletConfig servletConfig = getServletConfig();
		String city = servletConfig.getInitParameter("city");
		// ServletContext servletContext = getServletContext();
		ServletContext servletContext = servletConfig.getServletContext();
		String country = servletContext.getInitParameter("country");
		System.out.println("Config paramater:" + city);
		System.out.println("Context parameter:" + country);
		System.out.println("++++++++++++++++++++++++++++++++");
		ServletContext servletContext1 = servletConfig.getServletContext();
		String serCtx = servletContext1.getInitParameter("country");
		System.out.println(serCtx);
		System.out.println("++++++++++++++++++++++++++++++++");

		RequestDispatcher requestDispatcher = servletContext
				.getRequestDispatcher("/success.html");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}
}
