package com.shirishProgramming;

import javax.jws.WebService;


//Service Implementation
@WebService(endpointInterface="com.shirishProgramming.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		
		return "returning string hello" + name;
	}
	
}
