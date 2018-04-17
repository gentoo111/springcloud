package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class HystrixTurbineServer {

	// http://localhost:8762/hystrix
	// stream输入：http://localhost:8765/turbine.stream
	// 在dashboard可以看到两个服务实例聚合起来的指标
	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixTurbineServer.class).web(true).run(args);
	}

}