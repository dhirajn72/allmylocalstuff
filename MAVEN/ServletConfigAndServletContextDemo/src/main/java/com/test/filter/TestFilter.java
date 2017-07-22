package com.test.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class TestFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.err.println("TestFilter-init");
		Enumeration<String> enumeration = filterConfig.getInitParameterNames();
		ArrayList list = Collections.list(enumeration);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object val = it.next();
			String val1 = filterConfig.getInitParameter(val.toString());
			System.err.println("Filter config parameters:" + val1);
		}

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.err.println("doFilter-starts");
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		System.out.println(httpServletRequest.getContextPath());
		System.out.println(httpServletRequest.getRequestURL());
		System.out.println(httpServletRequest.getAuthType());
		System.out.println(httpServletRequest.getLocalPort());
		System.out.println("invoking do filter again");
		chain.doFilter(request, response);
		System.out.println("invoked do filter ");
		System.err.println("doFilter-ends");
	}

	public void destroy() {
		System.out.println("TestFilter-destroy()");
	}

}
