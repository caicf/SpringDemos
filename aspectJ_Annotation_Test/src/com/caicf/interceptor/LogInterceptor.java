package com.caicf.interceptor;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
public class LogInterceptor {
	@Before("execution(public * com.caicf.service..*.*(..))")
	public void before() {
		
		System.out.println("++++++++++Before+++++++++");
		
	}
	
	@After("execution(public * com.caicf.service..*.*(..))")
	public void after() {
		System.out.println("+++++++++after+++++++++++");
	}
	
}
