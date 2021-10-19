package com.syun.service;

import com.syun.dao.UserDao;
import com.syun.dao.UserDaoImpl;
import com.syun.dao.UserDaoImplOracle;
import com.syun.dao.UserDaoImplSqlserver;

public class UserServiceImpl implements UserService{
	
	// UserDao userDao = new UsesrDaoImpl();
	// UserDao userDao = new UsesrDaoImplSqlServer();
	// IOC 將要調用的物件交給下一層使用者決定，非寫死在程式中
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getUser() {
		userDao.getUser();
	}
}
