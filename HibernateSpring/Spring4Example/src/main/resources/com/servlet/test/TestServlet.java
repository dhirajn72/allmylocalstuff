package com.servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {

		System.out.println("TestServlet called");
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}

}
