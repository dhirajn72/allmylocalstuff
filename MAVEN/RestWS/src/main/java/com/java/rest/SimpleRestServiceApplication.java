package com.java.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class SimpleRestServiceApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public SimpleRestServiceApplication() {
		singletons.add(new SimpleRestService());
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
