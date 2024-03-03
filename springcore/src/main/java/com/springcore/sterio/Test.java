package com.springcore.sterio;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/sterio/ste_config.xml");
		Student s1=con.getBean("ob",Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());

	}

}
