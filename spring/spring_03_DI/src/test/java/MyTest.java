import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.pojo.Address;
import com.syun.pojo.Student;
import com.syun.pojo.User;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","userBean.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		
//		Address address = (Address) context.getBean("address");
//		System.out.println(address.toString());
		
		User user = (User) context.getBean("user");
		User user2 = (User) context.getBean("user");
		System.out.println(user == user2);
		
		User user3 = (User) context.getBean("user2");
		User user4 = (User) context.getBean("user2");
		System.out.println(user3 == user4);
		
	}
}
