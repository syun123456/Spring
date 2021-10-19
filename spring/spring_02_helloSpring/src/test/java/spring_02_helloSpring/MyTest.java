package spring_02_helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syun.pojo.HelloSpring;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloSpring hello = (HelloSpring) context.getBean("hello");
		System.out.println(hello.toString());
	}
}
