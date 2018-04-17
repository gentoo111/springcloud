package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

// @EnableDiscoveryClient，向eureka注册自己作为一个服务的调用client
// 之前的服务，EnableEurekaClient，代表的是向eureka注册自己，将自己作为一个服务
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class GreetingServiceApplication {

	// 多次访问http://localhost:8764/greeting?name=leo，发现每次访问的端口都不一样，在多个服务实例之间负载均衡了

	// http://localhost:8764/hystrix
	// 输入http://localhost:8764/hystrix.stream和title.访问接口，会在hystrix dashboard看到访问请求
	public static void main(String[] args) {
		SpringApplication.run(GreetingServiceApplication.class, args);
	}

	// 在spring容器中注入一个bean，RestTemplate，作为rest服务接口调用的客户端
	// @LoadBalanced标注，代表对服务多个实例调用时开启负载均衡
	// @Bean
	// @LoadBalanced
	// public RestTemplate restTemplate() {
	// return new RestTemplate();
	// }

}