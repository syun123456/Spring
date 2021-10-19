package com.syun.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{
	private Rent rent;
	
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	// �ͦ��N�z������k�Arent���M�w�n�N�z������
	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				rent.getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// ����ЪF��rent��k
		Object result = method.invoke(rent, args);
		seeHouse();
		fee();
		contract();
		return result;
	}
	
	public void seeHouse() {
		System.out.println("�ݩ�");
	}
	
	public void fee() {
		System.out.println("���򤶶O");
	}
	
	public void contract() {
		System.out.println("ñ��");
	}
}
