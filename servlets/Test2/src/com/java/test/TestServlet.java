package com.java.test;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		String nm = httpServletRequest.getParameter("name");

		Writer out = httpServletResponse.getWriter();
		Cookie[] cookie = httpServletRequest.getCookies();
		if (cookie == null) {
			out.write("<html><body>");
			out.write("<h2>You are new client.</h2>");
			out.write("</html></body>");
			HttpSession httpSession = httpServletRequest.getSession();
		} else {
			for (Cookie c : cookie) {
				out.write(c.getName() + " " + c.getValue());
			}
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/index.jsp");
		rd.include(httpServletRequest, httpServletResponse);
	}

}
