package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String> friends;
private Map<String,Integer>fee;
private Properties prop;

public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFee() {
	return fee;
}

public void setFee(Map<String, Integer> fee) {
	this.fee = fee;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", fee=" + fee + ", prop=" + prop + "]";
}







}
