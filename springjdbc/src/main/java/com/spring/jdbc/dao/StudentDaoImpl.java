package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements Studentdao{
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student1) {
		// TODO Auto-generated method stub
		String query="insert into student(id,name,city) values(?,?,?)";
		//fire the query
		int r=this.jdbcTemplate.update(query,student1.getId(),student1.getName(),student1.getCity());
		return r;
		
	}
	@Override
	public int change(Student student2) {
		// TODO Auto-generated method stub
		String query="update student set name=? , city=? where id=?";
		int r=this.jdbcTemplate.update(query,student2.getName(),student2.getCity(),student2.getId());
		
		return r;
	}
	
	@Override
	public int delete(Student student1) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,student1.getId());
		
		return r;
	}

	@Override
	public Student fetch(int id) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new StudentMapper();
		Student stud=this.jdbcTemplate.queryForObject(query, rowMapper,id);
		return stud;
	}
	
	@Override
	public List<Student> fetchAll() {
		// TODO Auto-generated method stub
		String query="select * from student";
		RowMapper<Student> rowMapper=new StudentMapper();
		List<Student> stud=this.jdbcTemplate.query(query, rowMapper);
		
		return stud;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

	
}
