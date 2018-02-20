package com.adam.rice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringZuulTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulTestApplication.class, args);
	}
}
