package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeClient {
public static void main(String args[]) {

	Resource res = new ClassPathResource("config.xml");
	@SuppressWarnings("deprecation")

	BeanFactory factory = new XmlBeanFactory(res);

	Employee empObj = (Employee)factory.getBean("empBean");
	empObj.showEmployeeDetails();
}
}
