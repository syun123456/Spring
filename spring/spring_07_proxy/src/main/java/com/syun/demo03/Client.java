package com.syun.demo03;

public class Client {
	public static void main(String[] agrs) {
		Host host = new Host();
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		
		// �M�w�n�N�z��
		pih.setRent(host);
		
		// �N�z���b�o�~�o��
		Rent proxy = (Rent) pih.getProxy();
		
		proxy.rent();
	}
}
