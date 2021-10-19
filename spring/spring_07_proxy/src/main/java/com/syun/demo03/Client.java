package com.syun.demo03;

public class Client {
	public static void main(String[] agrs) {
		Host host = new Host();
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		
		// 決定要代理誰
		pih.setRent(host);
		
		// 代理類在這才得到
		Rent proxy = (Rent) pih.getProxy();
		
		proxy.rent();
	}
}
