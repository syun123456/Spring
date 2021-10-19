package com.syun.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
	
	@Before("execution(* com.syun.service.UserServiceImpl.*(..))")
	public void before() {
		System.out.println("================執行前=================");
	}
	
	@After("execution(* com.syun.service.UserServiceImpl.*(..))")
	public void after() {
		System.out.println("================執行後=================");
	}
	
}
