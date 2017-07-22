package com.web.core;

import com.web.core.HelloServiceServiceStub.GetMessage;
import com.web.core.HelloServiceServiceStub.GetMessageResponse;

public class HelloClient {

	public static void main(String[] args) throws Exception {

		HelloServiceServiceStub stub = new HelloServiceServiceStub();
		GetMessage getMessage = new GetMessage();
		getMessage.setName("Dhiraj");
		GetMessageResponse response = stub.getMessage(getMessage);
		//String msg = response.getGetMessageReturn();
		//System.out.println(msg);

	}

}
