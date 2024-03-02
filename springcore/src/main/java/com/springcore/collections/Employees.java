package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
	private String name;
	private List<String>phones;
	private Set<String>adrs;
	private Map<String,String>course;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String name, List<String> phones, Set<String> adrs, Map<String, String> course) {
		super();
		this.name = name;
		this.phones = phones;
		this.adrs = adrs;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAdrs() {
		return adrs;
	}
	public void setAdrs(Set<String> adrs) {
		this.adrs = adrs;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
}
