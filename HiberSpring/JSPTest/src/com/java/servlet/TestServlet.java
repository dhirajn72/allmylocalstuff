package com.java.servlet;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/formSubmit.do")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		System.out.println("service called");
		String name = httpServletRequest.getParameter("name");
		String email = httpServletRequest.getParameter("email");
		String phone = httpServletRequest.getParameter("phone");

		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
		Writer out = httpServletResponse.getWriter();

		out.write("<h2><center>Hi," + name + "</br>");
		out.write("your email is:," + email + "</br>");
		out.write("and your phone is:," + phone+"</center></br>");
		httpServletRequest.setAttribute("NM", name);
		httpServletRequest.setAttribute("EM", email);
		httpServletRequest.setAttribute("PH", phone);
		/*RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("home.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
*/
	}
}
