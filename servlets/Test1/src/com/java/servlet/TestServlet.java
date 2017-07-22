package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		ServletConfig servletConfig = getServletConfig();
		String district = servletConfig.getInitParameter("district");
		String state = servletConfig.getInitParameter("state");
		String country = servletConfig.getInitParameter("country");

		String name = httpServletRequest.getParameter("name");
		/*
		 * *******************************************
		 */
		String street1 = getServletConfig().getServletContext()
				.getInitParameter("street");
		String city1 = getServletConfig().getServletContext().getInitParameter(
				"city");
		String state1 = getServletConfig().getServletContext()
				.getInitParameter("state");

		System.out.println(name);
		System.out.println(district);
		System.out.println(state);
		System.out.println(country);
		System.out.println(street1);
		System.out.println(city1);
		System.out.println(state1);
		System.out.println("ServletContext:"
				+ getServletContext().getInitParameter("city"));

		httpServletRequest.setAttribute("NM", name);
		httpServletRequest.setAttribute("DS", district);
		httpServletRequest.setAttribute("ST", state);
		httpServletRequest.setAttribute("COU", country);
		httpServletRequest.setAttribute("ST1", street1);
		httpServletRequest.setAttribute("CT1", city1);
		httpServletRequest.setAttribute("ST2", state1);

		RequestDispatcher requestDispatcher = getServletConfig()
				.getServletContext().getRequestDispatcher("/home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}

}
