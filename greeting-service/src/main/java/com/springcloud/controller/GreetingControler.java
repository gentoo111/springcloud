package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.service.SayHelloService;

@RestController
public class GreetingControler {

	// @Autowired
	// private GreetingService greetingService;

	@Autowired
	private SayHelloService sayHelloService;

	@Value("${server.port}")
	private String port;

	@Value("${defaultName}")
	private String defaultName;

	// http://localhost:8766/greeting-service/greeting?name=&userId=1
	// http://localhost:8766/greeting-service/greeting?name=merry&userId=1
	@RequestMapping("/greeting")
	public String greeting(@RequestParam String name) {
		String result = null;

		if (name != null && !"".equals(name)) {
			result = sayHelloService.sayHello(name);
		} else {
			result = "hello, this is default name: " + defaultName;
		}

		result += " , through greeting service from port: " + port;

		return result;
	}

}