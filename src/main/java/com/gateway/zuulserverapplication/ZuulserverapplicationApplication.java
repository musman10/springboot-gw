package com.gateway.zuulserverapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulserverapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulserverapplicationApplication.class, args);
	}

}
