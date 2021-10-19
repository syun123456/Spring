package com.syun.demo01;

// 仲介 (代理房東)，並添加其他功能
public class Proxy implements Rent{
	public Host host;
	
	public Proxy(Host host) {
		this.host = host;
	}
	
	public void rent() {
		host.rent();
		seeHouse();
		fee();
		contract();
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
