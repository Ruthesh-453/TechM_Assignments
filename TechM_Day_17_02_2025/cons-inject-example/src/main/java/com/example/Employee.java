package com.example;

public class Employee {

	private int id;
	private String name;
	

    public Employee() {
    	System.out.println("In Default Constructor");
    }

    public Employee(int id,String name) {
    	this.id=id;
    	this.name=name;
    }
    
    public void showEmployeeDetails() {
    	System.out.println("Employee Id is" +  " " +id);
    	System.out.println("Employee Name is" + " " + name);
    }
}
