package com.syun.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	// returnValue: ��k����^��
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("����F" + method.getName() + "�A���G��:" + returnValue);
	}
	
}
