package com.syun.service;

import com.syun.dao.UserDao;
import com.syun.dao.UserDaoImpl;
import com.syun.dao.UserDaoImplOracle;
import com.syun.dao.UserDaoImplSqlserver;

public class UserServiceImpl implements UserService{
	
	// UserDao userDao = new UsesrDaoImpl();
	// UserDao userDao = new UsesrDaoImplSqlServer();
	// IOC �N�n�եΪ�����浹�U�@�h�ϥΪ̨M�w�A�D�g���b�{����
	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getUser() {
		userDao.getUser();
	}
}
