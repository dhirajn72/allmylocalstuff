package com.jlcindia.books;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws ServletException,
			IOException {

		String cat = httpServletRequest.getParameter("category");
		if (cat != null || cat.equals("JAVA")) {
			ArrayList<String> blist = new ArrayList<String>();
			blist.add("Java");
			blist.add("JDBC");
			blist.add("JSP");
			blist.add("Spring");
			blist.add("Hibernate");
			HttpSession httpSession = httpServletRequest.getSession();
			httpSession.setAttribute("BOOKS", blist);
		} else {
			httpServletRequest.setAttribute("MSG",
					"No books found for the specifies category" + cat);
		}
		RequestDispatcher requestDispatcher = httpServletRequest
				.getRequestDispatcher("showbooks.jsp");
	}
}
