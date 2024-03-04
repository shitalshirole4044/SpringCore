package com.springcore.spELDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{12+54}")
	private int x;
	
	@Value("#{7>8?76:90}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25.0)}")
	private int z;
	
	@Value("#{T(java.lang.Math).E}")
	private int e;
	
	@Value("#{new java.lang.String('shital shirole')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean flag;
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", flag=" + flag + "]";
	}
	public Demo(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
