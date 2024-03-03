package com.springcore.lifecycly;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
private String subject;

@Override
public String toString() {
	return "Example [subject=" + subject + "]";
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	System.out.println("Setting Subject");
	this.subject = subject;
}

@PostConstruct
public void init() {
	System.out.println("Init method of Annotaion");
}

@PreDestroy
public void destroy() {
	System.out.println("destroy method of Annotation");
}
}
