package com.syun.mapper;

import java.util.List;
import java.util.Map;

import com.syun.pojo.User;

public interface UserMapper {
	List<User> selectUser();
	
	int addUser(User user);
	
	int deleteUser(int id);
}