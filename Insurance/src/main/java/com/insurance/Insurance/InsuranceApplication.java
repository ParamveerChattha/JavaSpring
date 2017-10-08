package com.insurance.Insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(InsuranceApplication.class, args);
		Customer customer = (Customer) ctx.getBean("customer");
		customer.Scan();
	}
}
