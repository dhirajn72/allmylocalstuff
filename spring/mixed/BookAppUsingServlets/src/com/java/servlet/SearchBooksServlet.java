package com.java.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchBooksServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {

		String cat = httpServletRequest.getParameter("category");
		if (cat != null && cat.equals("java")) {
			ArrayList<String> blist = new ArrayList<String>();
			blist.add("Spring");
			blist.add("Hibernate");
			blist.add("Jsp");
			blist.add("Servlets");
			blist.add("Struts");
			HttpSession httpSession = httpServletRequest.getSession();
			httpSession.setAttribute("BOOKS", blist);
		} else {
			httpServletRequest.setAttribute("MSG",
					"No books found with category:" + cat);
		}

		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("showbooks.jsp");
		requestDispatcher.forward(httpServletRequest, httpServletResponse);

	}

}
