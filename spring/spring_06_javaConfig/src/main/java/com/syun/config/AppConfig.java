package com.syun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.syun.pojo.User;

// @Configuration�����O�@��@Component�A�N��@�Ӱt�m���A���P��applicationContext.xml
@Configuration
public class AppConfig {
	
	// ���P <bean id="getUser"(��k�W) class="com.syun.pojo.User"(��^��)/>
	@Bean
	public User getUser() {
		return new User();
	}
}
