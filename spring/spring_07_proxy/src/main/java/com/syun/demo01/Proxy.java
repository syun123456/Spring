package com.syun.demo01;

// �� (�N�z�ЪF)�A�òK�[��L�\��
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
		System.out.println("�ݩ�");
	}
	
	public void fee() {
		System.out.println("���򤶶O");
	}
	
	public void contract() {
		System.out.println("ñ��");
	}
}
