package com.springcore.sterio;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	@Value("Shital")
	private String name;

	@Value("Pune")
	private String city;

	@Value("#{temp}")
	private List<String> Address;

	public List<String> getAddress() {
		return Address;
	}

	public void setAddress(List<String> address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
