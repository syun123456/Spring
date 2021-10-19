package com.syun.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{

	// method: 要執行的目標物件方法
	// args: 參數
	// target: 目標物件
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass() + "的" + method.getName() + "被執行");
		
	}
	
}
