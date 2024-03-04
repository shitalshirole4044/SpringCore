package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface Studentdao {
	 public int insert(Student student1);
	 public int change(Student student2);
	 public int delete(Student student1);
	 public Student fetch(int id);
	 public List<Student> fetchAll();
}
