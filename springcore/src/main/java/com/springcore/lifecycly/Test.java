package com.springcore.lifecycly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/lifecycly/Lc_config.xml");
		
//		using xml lifecycle method
//		Samosa s1=(Samosa)con.getBean("s1");
//		System.out.println(s1);
		
//		registering shutdown hook
//		it enables the destroy method
		con.registerShutdownHook();
		
//		using interface lifecycle method
//		Pepsi p1=(Pepsi)con.getBean("p1");
//		System.out.println(p1);
		
//		using annotation lifecycle method
		Example e=(Example) con.getBean("e1");
		System.out.println(e);

	}

}
