import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.service.UserService;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// 目標物件為介面，不是實現類
		UserService userSerivce = (UserService) context.getBean("userServiceImpl");
		userSerivce.create();
	}
}
