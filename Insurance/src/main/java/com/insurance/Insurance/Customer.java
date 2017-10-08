package com.insurance.Insurance;

import org.apache.log4j.LogManager;

//import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
@Component
public class Customer {
	int id;
	String name;
	int policyNumber;
	private static org.apache.log4j.Logger logger = LogManager.getLogger("Customer.class");
	@Autowired
	Claim c;
//	Scanner sc = new Scanner(System.in);
	void Scan() {	
		System.out.println("Enther the id, name and PolicyNumber ");
	//this.id = sc.nextInt();
	//this.name = sc.next();
	//this.policyNumber = sc.nextInt();
		this.id=45;
		this.name= "Param";
		this.policyNumber= 12908;
	c.setId(this.id);
	c.setName(this.name);
	c.setPolicyNumber(this.policyNumber);
	c.Show();
	}
	
	@Autowired
	Surveyor<Claim> s;
	//Surveyor<Claim> s = new Surveyor<Claim>();
	public boolean customerValidation() {
		logger.debug("customer details scanned");
		System.out.println(c.getName() + " " + c.getId());
		return s.validate(c);
	}
	}
