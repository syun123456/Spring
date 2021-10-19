package com.syun.demo02;

public class Client {
	public static void main(String[] args) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		
		UserServiceProxy proxy = new UserServiceProxy();
		
		proxy.setUserServiceImpl(userServiceImpl);
		
		proxy.create();
	}
}
