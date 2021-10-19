package com.syun.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.syun.pojo.User;

// @Configuration本身是一個@Component，代表一個配置類，等同於applicationContext.xml
@Configuration
public class AppConfig {
	
	// 等同 <bean id="getUser"(方法名) class="com.syun.pojo.User"(返回值)/>
	@Bean
	public User getUser() {
		return new User();
	}
}
