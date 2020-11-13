package com.poc.Aop1;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	public int dailyWorkForEarning() {
		System.out.println("Need to go to Office");
		return 0;
	}
}
