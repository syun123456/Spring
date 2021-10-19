package com.syun.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.syun.pojo.User;

public class UserMapperImpl implements UserMapper{
	
	private SqlSessionTemplate sqlSession;
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<User> selectUser() {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user = new User(9, "zzz", "789456123");
		
		userMapper.addUser(user);
		userMapper.deleteUser(5);
		
		return userMapper.selectUser();
		
	}

	public int addUser(User user) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.addUser(user);
	}

	public int deleteUser(int id) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.deleteUser(id);
	}
	
	
	
}
