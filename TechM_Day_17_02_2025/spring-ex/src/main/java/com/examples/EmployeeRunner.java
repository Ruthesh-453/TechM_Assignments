package com.examples;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class EmployeeRunner {
public static void main(String args[]) {
	
	Resource res= new ClassPathResource("config.xml");
	@SuppressWarnings("deprecation")
	BeanFactory factory = new XmlBeanFactory(res);

	Employee emp = (Employee)factory.getBean("empBean");
	emp.displayValues();
	}
}