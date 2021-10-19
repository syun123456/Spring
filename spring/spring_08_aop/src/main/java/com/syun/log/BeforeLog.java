package com.syun.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{

	// method: �n���檺�ؼЪ����k
	// args: �Ѽ�
	// target: �ؼЪ���
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(target.getClass() + "��" + method.getName() + "�Q����");
		
	}
	
}
