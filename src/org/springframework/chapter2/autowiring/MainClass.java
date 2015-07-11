package org.springframework.chapter2.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	public static void main (String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowiring-byname.xml");
		
		EmployeeServiceImpl employeeService = context.getBean("employeeService", EmployeeServiceImpl.class);
		
		System.out.println(employeeService.getEmployeeDao().getEmployeeName());
		
	}
}
