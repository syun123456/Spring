package com.syun.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	// �ͦ��N�z������k
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log(method.getName());
		Object result = method.invoke(target, args);
		return result;
	}
	
	public void log(String msg) {
		System.out.println("����" + msg + "��k");
	}
}
