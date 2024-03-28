package com.cj.markableInterfaces;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable {
	
	private String name;
	private int id;
	
	public Employee() {
		
	}
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Employee [" + name + ", " + id + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
