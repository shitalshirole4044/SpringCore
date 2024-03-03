package com.springcore.constructorInjection;

public class Addition {
	private double a;
	private double b;
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public void doSum() {
		System.out.println("sum:"+(this.a+this.b));
	}
	
}
