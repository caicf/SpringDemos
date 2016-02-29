package com.caicf.interceptor;


import org.springframework.stereotype.Component;


@Component
public class LogInterceptor {
	//@Before("execution(public * com.caicf.service..*.*(..))")
	public void before() {
		
		System.out.println("++++++++++Before+++++++++");
		
	}
	
	//@After("execution(public * com.caicf.service..*.*(..))")
	public void after() {
		System.out.println("+++++++++after+++++++++++");
	}
	
}
