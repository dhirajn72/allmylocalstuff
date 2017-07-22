package org.servlet.test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class TestServetFilter
 */
@WebFilter("/testservlet.jsp")
public class TestServetFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		String name = servletRequest.getParameter("name");
		String email = servletRequest.getParameter("email");
		String phone = servletRequest.getParameter("phone");

		System.out.println(name + " " + email + " " + phone);

		chain.doFilter(servletRequest, servletResponse);
		System.out.println("filter after doFilter() method");

	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	}

}
