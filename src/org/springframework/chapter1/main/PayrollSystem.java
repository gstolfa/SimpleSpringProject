package org.springframework.chapter1.main;

import org.springframework.chapter1.service.EmployeeService;
import org.springframework.chapter1.service.EmployeeServiceImpl;
import org.springframework.chapter2.constructioninjection.Employee;
import org.springframework.chapter2.setterinjection.ATM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	public static void main(String...args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeServiceImpl.class); 
		
		Employee employee = context.getBean("employee", Employee.class);
	
		ATM atm = context.getBean("atmBean", ATM.class);
		
		atm.printBalance(": 7978");
	
		System.out.println(employeeService.generateEmployeeId());

		System.out.println(employee.toString());
		
		
	}
	
}
