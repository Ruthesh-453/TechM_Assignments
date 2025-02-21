package com.examples;
//bean component
public class Employee {
//instance variable
	private int id;
	private String name;
	private int salary;
	
	//constructors
	//default constructor
	public Employee() {}
	//parameterized constructor
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
}
