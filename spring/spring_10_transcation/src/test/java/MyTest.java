import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.mapper.UserMapper;
import com.syun.pojo.User;

public class MyTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserMapper userMapper = context.getBean("userMapperImpl", UserMapper.class);
		
		List<User> users = userMapper.selectUser();
		
		for(User user:users) {
			System.out.println(user);
		}
		


	}
}
