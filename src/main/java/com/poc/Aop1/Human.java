package com.poc.Aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Human {

	@Before("execution(public * dailyWork*())")
	public void wakeUp(JoinPoint joinPoint) {
		System.out.println("Calling class "+joinPoint.getTarget().getClass().getName()+" and methods="+joinPoint.getSignature().getName());
		System.out.println("Need to wake up early morning");
		
	}
	
	@AfterReturning(pointcut="execution(* numberToget())" , returning="value")
	public void nextWake(int value) {
		System.out.println("pointcut value="+value);
	}
	
	@Around("execution(* totalGDPA(..))")
	public void NWake(ProceedingJoinPoint joinPoint) {
		
		System.out.println("aregs "+joinPoint.getArgs()[0]);
		
		
	}
}
