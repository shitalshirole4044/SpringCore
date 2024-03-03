package com.springcore.Auto.wired.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/Auto/wired/Annotations/An_config.xml");
	Employee e1=con.getBean("e1",Employee.class);
	System.out.println(e1);
}
}
