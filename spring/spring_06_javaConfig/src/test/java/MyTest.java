import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.syun.config.AppConfig;
import com.syun.pojo.User;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("getUser");
		
		System.out.println(user.getName());
	}
}
