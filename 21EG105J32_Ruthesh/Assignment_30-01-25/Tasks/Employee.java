package org1;

public class Employee {
int empId;
String empName;
double sal;
int experience;

public Employee(int empId,String empName,double sal,int experience) {
	this.empId=empId;
	this.empName=empName;
	this.sal=sal;
	this.experience=experience;
	
}

public String getEmployeeDetails() {
	return "Employee Id: "+empId+", Employee Name: "+empName+", Employee Salary: "+sal+", Experience: "+experience;
}

public void setEmployeeDetails(int empId,String empName,double sal,int experience) {
	this.empId=empId;
	this.empName=empName;
	this.sal=sal;
	this.experience=experience;
}

public void getLoanEligibility() {
	if(experience>=5) {
		if (sal>=1500000) {
			System.out.println("Loan eligible for 7 Lakhs");
		}else if(sal>=1000000) {
			System.out.println("Loan eligible for 5 Lakhs");
		}else if(sal>=600000) {
			System.out.println("Loan eligible for 2 Lakhs");
		}
		
	}else {
		System.out.println("Not Eligible for Loan");
	}
}

	public static void main(String args[]) {
		Employee emp=new Employee(101,"Raj",800000,7);
		System.out.println(emp.getEmployeeDetails());
		emp.getLoanEligibility();
		emp.setEmployeeDetails(105, "Sam", 1200000, 8);
		System.out.println(emp.getEmployeeDetails());
		emp.getLoanEligibility();
	}
	
	
}