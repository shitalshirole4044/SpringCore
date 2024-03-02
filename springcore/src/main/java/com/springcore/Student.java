package com.springcore;

public class Student {
 private int id;
 private String name;
// private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public String getAddress() {
//	return address;
//}
//public void setAddesss(String address) {
//	this.address = address;
//}
//public Student(int id, String name, String address) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.address = address;
//}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

//public String toString() {
//	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
//}

 
}
