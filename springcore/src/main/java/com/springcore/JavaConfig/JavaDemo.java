package com.springcore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcore.JavaConfig")
public class JavaDemo {
	
	@Bean(name= {"temp","comp"})
	public Student getStudent() {
		//creating new Student Object
		Student s1=new Student(getSamosa());
		return s1;
	}
	
	@Bean()
	public Samosa getSamosa() {
		Samosa s1=new Samosa();
		return s1;
	}
}
