package com.syun.demo01;

// 房東 (被代理的物件)，可以專注於該物件應該執行的功能
public class Host implements Rent{
	public void rent() {
		System.out.println("房東想出租房屋...");
	}
}
