package com.poc.Aop1;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public void dailyWorkForLearing() {
		System.out.println("Need to go to school");
	}
	
	public int numberToget() {
		System.out.println("Need number");
		return 56;
		
	}
	
	public void totalGDPA(int a ,int b) {
		System.out.println(a+"-----"+b);
		System.out.println("Test swarup");
	}
	
	public String welcome() {
		return "wellcome";
		
	}
}
