package com.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = { "com.app1" })
public class InvestmentFundsAPIGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvestmentFundsAPIGatewayApplication.class, args);
	}
}
