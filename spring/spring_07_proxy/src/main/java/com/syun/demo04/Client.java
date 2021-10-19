package com.syun.demo04;

import com.syun.demo02.UserService;
import com.syun.demo02.UserServiceImpl;

public class Client {
	public static void main(String[] agrs) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		
		// 決定要代理誰
		pih.setTarget(userServiceImpl);
		
		// 代理類在這才得到
		UserService proxy = (UserService) pih.getProxy();
		
		proxy.delete();
	}
}
