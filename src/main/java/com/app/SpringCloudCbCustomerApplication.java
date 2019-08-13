package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringCloudCbCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCbCustomerApplication.class, args);
	}

}
