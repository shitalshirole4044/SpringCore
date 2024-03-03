package com.springcore.Auto.wired.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("a2")
	public void setAddress(Address address) {
		System.out.println("Setting adddress");
		this.address = address;
	}

	
	public Employee(Address address) {
		System.out.println("inside constructor");
	
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
