package com.springcloud.service;

import org.springframework.stereotype.Service;

// 写一个服务，注入RestTemplate服务调用客户端
@Service
public class GreetingService {

	// @Autowired
	// private RestTemplate restTemplate;

	// 用SAY-HELLO-SERVICE这个服务名替代实际的ip地址
	// ribbon负载在多个服务实例之间负载均衡，每次调用随机挑选一个实例，然后替换服务名
	// public String greeting(String name) {
	// return restTemplate.getForObject("http://SAY-HELLO-SERVICE/sayHello?name=" +
	// name, String.class);
	// }

}