package com.servlets.org;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {

		String fname = httpServletRequest.getParameter("fname");
		String lname = httpServletRequest.getParameter("lname");

		ServletConfig servletConfig = getServletConfig();
		String cfg = servletConfig.getInitParameter("email");
		ServletContext servletContext = servletConfig.getServletContext();
		String ctx = servletContext.getInitParameter("city");

		System.out.println("fname->" + fname);
		System.out.println("lname->" + lname);
		System.out.println("ServletConfig->" + cfg);
		System.out.println("ServletContext->" + ctx);

		httpServletRequest.setAttribute("fname", fname);
		httpServletRequest.setAttribute("lname", lname);
		httpServletRequest.setAttribute("cfg", cfg);
		httpServletRequest.setAttribute("ctx", ctx);

		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("/WEB-INF/home.jsp");

		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}

}
