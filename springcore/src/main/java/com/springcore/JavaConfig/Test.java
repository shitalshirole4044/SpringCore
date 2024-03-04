package com.springcore.JavaConfig;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test {
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/JavaConfig/co_config.xml");
//		Student s1=con.getBean("student1",Student.class);
		
//		System.out.println(s1);
//		con.close();
		
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaDemo.class);
		Student s1=con.getBean("temp",Student.class);
		System.out.println(s1);
		s1.study();
		
	}
}
