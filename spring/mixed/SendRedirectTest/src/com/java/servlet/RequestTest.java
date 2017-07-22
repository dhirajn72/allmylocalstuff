package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RequestTest extends HttpServlet {
	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {

		String url = httpServletRequest.getParameter("url");
		System.out.println(url);
		if (url == null || url.trim().length() == 0) {
			RequestDispatcher requestDispatcher = httpServletRequest
					.getRequestDispatcher("error.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
		}
		if (url.startsWith("www")) {
			String url1 = "http://" + url;
			// String url2 =
			// "http://www.facebook.com/login.jsp?uname=dhiraj&password=kumar";
			httpServletResponse.sendRedirect(url1);
		}

	}

}
