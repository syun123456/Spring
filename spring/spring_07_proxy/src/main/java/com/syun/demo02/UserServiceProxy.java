package com.syun.demo02;

public class UserServiceProxy implements UserService{
	private UserServiceImpl userServiceImpl;

	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	
	public void create() {
		log("create");
		userServiceImpl.create();
	}
	public void read() {
		log("read");
		userServiceImpl.read();
	}
	public void update() {
		log("update");
		userServiceImpl.update();
	}
	public void delete() {
		log("delete");
		userServiceImpl.delete();
	}
	
	public void log(String msg) {
		System.out.println("[Debug] 使用" + msg + "方法");
	}
}
