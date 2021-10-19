package com.syun.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Object target;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	// 生成代理類的方法
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
		System.out.println("執行" + msg + "方法");
	}
}
