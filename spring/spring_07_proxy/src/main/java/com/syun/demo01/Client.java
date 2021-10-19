package com.syun.demo01;

public class Client {
	public static void main(String[] agrs) {
		Host host = new Host();
		
		// 透過仲介代理出租，並有其他業務管理
		Proxy proxy = new Proxy(host);
		
		proxy.rent();
	}
}
