package com.syun.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.syun.pojo.User;

public class UserMapperImpl2  extends SqlSessionDaoSupport implements UserMapper{
	
	public List<User> selectUser() {
		//SqlSession sqlSession = getSqlSession();
		//UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return getSqlSession().getMapper(UserMapper.class).selectUser();
	} 
}
