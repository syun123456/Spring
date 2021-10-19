package com.syun.demo02;

public class UserServiceImpl implements UserService{
	public void create() {
		System.out.println("增加用戶");
	}
	public void read() {
		System.out.println("查詢用戶");
	}
	public void update() {
		System.out.println("修改用戶");
	}
	public void delete() {
		System.out.println("刪除用戶");
	}
}
