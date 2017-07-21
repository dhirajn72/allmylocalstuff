package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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

		String sid = httpServletRequest.getParameter("sid");
		String sname = httpServletRequest.getParameter("sname");
		String email = httpServletRequest.getParameter("email");
		String phone = httpServletRequest.getParameter("phone");
		PrintWriter out = httpServletResponse.getWriter();
		RequestDispatcher requestDispatcher;
		if (sid == null || sid.trim().length() == 0) {
			httpServletRequest.setAttribute("SID", "Sid is mandatory");
			out.write("Sid is mandatory");
			requestDispatcher = httpServletRequest
					.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);

		} else if (sname == null || sname.trim().length() == 0) {
			httpServletRequest.setAttribute("SNAME", "Sname is mandatory");
			requestDispatcher = httpServletRequest
					.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);

		} else if (email == null || email.trim().length() == 0) {
			httpServletRequest.setAttribute("EMAIL", "Email is mandatory");
			requestDispatcher = httpServletRequest
					.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
		} else if (phone == null || phone.trim().length() == 0) {
			httpServletRequest.setAttribute("PHONE", "Phone is mandatory");
			requestDispatcher = httpServletRequest
					.getRequestDispatcher("index.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
		} else {

			List list = new ArrayList();
			list.add(sid);
			list.add(sname);
			list.add(email);
			list.add(phone);
			httpServletRequest.setAttribute("AL", list);
			requestDispatcher = getServletContext().getRequestDispatcher(
					"/home.jsp");
			requestDispatcher.forward(httpServletRequest, httpServletResponse);
		}

	}
}
