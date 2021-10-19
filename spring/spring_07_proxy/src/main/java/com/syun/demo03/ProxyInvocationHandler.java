package com.syun.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Rent rent;
	
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	// 生成代理類的方法，rent為決定要代理的介面
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				rent.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 執行房東的rent方法
		Object result = method.invoke(rent, args);
		seeHouse();
		fee();
		contract();
		return result;
	}
	
	public void seeHouse() {
		System.out.println("看房");
	}
	
	public void fee() {
		System.out.println("收仲介費");
	}
	
	public void contract() {
		System.out.println("簽約");
	}
}
