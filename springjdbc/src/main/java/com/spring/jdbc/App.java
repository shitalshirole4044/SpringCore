package com.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Studentdao;
import com.spring.jdbc.entities.Student;

import java.util.List;

import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//        spring jdbc-->JdbcTemplate
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		Studentdao dao = con.getBean("StudentDao", Studentdao.class);
		Student s1 = new Student();
		
//		insert query
//        s1.setId(3);
//        s1.setName("jayesh shirole");
//        s1.setCity("Nagpur");
//        
//        int result=dao.insert(s1);
//        System.out.println("No of student added"+result);

		
//		update query
//		s1.setId(2);
//		s1.setName("Bhakti Patare");
//		s1.setCity("Malegaon");
//		int result = dao.change(s1);
//		System.out.println("No of student added" + result);
		
//		delete query
//		s1.setId(3);
//		int res=dao.delete(s1);
//		System.out.println("No of students deleted"+res);
		
//		fetch data
//		s1.setId(2);
//		Student stud=dao.fetch(2);
//		System.out.println(stud);
		
//	  fetch all data
		List<Student> stud1=(List<Student>) dao.fetchAll();
		System.out.println(stud1);
		
		for (Student record : stud1) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getCity());
	      }  
		
		
		

	}
}
