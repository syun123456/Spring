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
		return userMapper.selectUser();
		
	}
	
}
