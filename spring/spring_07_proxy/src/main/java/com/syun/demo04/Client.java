package com.syun.demo04;

import com.syun.demo02.UserService;
import com.syun.demo02.UserServiceImpl;

public class Client {
	public static void main(String[] agrs) {
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		
		ProxyInvocationHandler pih = new ProxyInvocationHandler();
		
		// �M�w�n�N�z��
		pih.setTarget(userServiceImpl);
		
		// �N�z���b�o�~�o��
		UserService proxy = (UserService) pih.getProxy();
		
		proxy.delete();
	}
}
