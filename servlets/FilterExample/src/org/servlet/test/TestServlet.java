package org.servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.protocol.RequestDispatcherRegistry;

@WebServlet("/testservlet.jsp")
public class TestServlet extends HttpServlet {

	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {
		String name = httpServletRequest.getParameter("name");
		String email = httpServletRequest.getParameter("email");
		String phone = httpServletRequest.getParameter("phone");

		String msg = "Hi " + name + " your email is " + email
				+ " and your phone no is " + phone;
		httpServletRequest.setAttribute("MSG", msg);
		System.out.println(name + " " + email + " " + phone);
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("success.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);
	}
}
