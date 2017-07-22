package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		System.out.println("TestServlet-doGet() starts");
		String uname = httpServletRequest.getParameter("username");
		String pass = httpServletRequest.getParameter("password");
		System.out.println(uname);
		System.out.println(pass);

		System.out.println("TestServlet-doGet() ends");
		httpServletRequest.setAttribute("UN", uname);
		httpServletRequest.setAttribute("PS", pass);
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
	}

	@Override
	protected void doPost(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		System.out.println("TestServlet-doPost() starts");
		String uname = httpServletRequest.getParameter("username");
		String pass = httpServletRequest.getParameter("password");
		System.out.println(uname);
		System.out.println(pass);

		System.out.println("TestServlet-doPost() ends");
		httpServletRequest.setAttribute("UN", uname);
		httpServletRequest.setAttribute("PS", pass);
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}

	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		System.out.println("TestServlet-protected service() starts");
		String uname = httpServletRequest.getParameter("username");
		String pass = httpServletRequest.getParameter("password");
		System.out.println(uname);
		System.out.println(pass);

		System.out.println("TestServlet-protected service() ends");
		httpServletRequest.setAttribute("UN", uname);
		httpServletRequest.setAttribute("PS", pass);
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
	}

	/*@Override
	public void service(ServletRequest servletRequest,
			ServletResponse servletResponse) throws ServletException,
			IOException {
		System.out.println("TestServlet-public service() starts");
		String uname = servletRequest.getParameter("username");
		String pass = servletRequest.getParameter("password");
		System.out.println(uname);
		System.out.println(pass);

		System.out.println("TestServlet-public service() ends");
		servletRequest.setAttribute("UN", uname);
		servletRequest.setAttribute("PS", pass);
		RequestDispatcher requestDispatcher = servletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(servletRequest, servletResponse);
	}*/
}
