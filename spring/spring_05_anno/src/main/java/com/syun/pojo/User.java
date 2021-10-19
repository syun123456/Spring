package com.syun.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// ���P��bxml�]�w <bean id = "user" class="com.syun.pojo.User" scope="prototype"/>
@Component
@Scope("prototype")
public class User {
	
	// <property name="name" value="Syun"/>
	@Value("Syun")
	public String name;
}
