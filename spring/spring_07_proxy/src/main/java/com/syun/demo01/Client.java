package com.syun.demo01;

public class Client {
	public static void main(String[] agrs) {
		Host host = new Host();
		
		// �z�L�򤶥N�z�X���A�æ���L�~�Ⱥ޲z
		Proxy proxy = new Proxy(host);
		
		proxy.rent();
	}
}
