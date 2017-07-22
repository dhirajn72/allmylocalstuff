package com.java.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestApp extends Application {
	private final Set<Object> singletons = new HashSet<Object>();

	public RestApp() {
		singletons.add(new RestDemo());

	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	@Override
	public Set<Class<?>> getClasses() {
		return null;
	}

}
