package com.syun.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	// returnValue: 方法的返回值
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("執行了" + method.getName() + "，結果為:" + returnValue);
	}
	
}
