package com.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class SayHelloServiceFallback implements SayHelloService {

	@Override
	public String sayHello(String name) {
		return "error, " + name;
	}

}