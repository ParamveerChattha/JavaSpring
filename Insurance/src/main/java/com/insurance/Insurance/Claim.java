package com.insurance.Insurance;

import org.apache.log4j.LogManager;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class Claim {
	private int id;
	private String name;
	private int policyNumber;
	private static org.apache.log4j.Logger logger = LogManager.getLogger("Claim.class");
	
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	int getPolicyNumber() {
		return policyNumber;
	}
	void Show() {
		logger.debug("id , name and Policy Number updated");
	//System.out.println(id + " " + name + " " + policyNumber);
	}
}
