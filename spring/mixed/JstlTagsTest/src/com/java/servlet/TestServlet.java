package com.java.servlet;

import java.io.IOException;
import java.util.ArrayList;

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
		System.out.println("TestServlet starts");

		ArrayList list = new ArrayList();
		list.add(new Integer(99));
		list.add(new Double(999));
		list.add(new String("Hello"));
		list.add("Hai");
		list.add(new Boolean(true));
		httpServletRequest.setAttribute("AL", list);
		System.out.println("TestServlet ends");
		RequestDispatcher dispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		dispatcher.forward(httpServletRequest, httpServletResponse);

	}

}
