package com.springcore.spELDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/spELDemo/spel_config.xml");
		Demo d1=con.getBean("demo",Demo.class);
		System.out.println(d1);
		System.out.println(d1.getZ());
		System.out.println(d1.getE());
		System.out.println(d1.getName());
		System.out.println(d1.isFlag());
		
	}

}
