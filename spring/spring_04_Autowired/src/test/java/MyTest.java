import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.pojo.People;

public class MyTest {
	public static void main(String[] agrs) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		People people = context.getBean("people", People.class);
		
		people.getCat().shout();
		people.getDog().shout();
		
		System.out.println(people.getName());
	}
}
