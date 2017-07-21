package com.jlcindia.spring.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {
	public String getMessage(String name);
}
