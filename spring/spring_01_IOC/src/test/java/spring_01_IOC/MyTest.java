package spring_01_IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.dao.UserDaoImpl;
import com.syun.dao.UserDaoImplMysql;
import com.syun.dao.UserDaoImplOracle;
import com.syun.service.UserService;
import com.syun.service.UserServiceImpl;

public class MyTest {
	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoImplOracle());
		userService.getUser();
		
		//***************************************
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userService2");
		userServiceImpl.getUser();
	}
}
