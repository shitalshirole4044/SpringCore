package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/E_config.xml");
       Employees emp1=(Employees) context.getBean("emp1");
       System.out.println(emp1.getName());
       System.out.println(emp1.getAdrs());
       System.out.println(emp1.getCourse());
       System.out.println(emp1.getPhones());
       
       
	}

}
