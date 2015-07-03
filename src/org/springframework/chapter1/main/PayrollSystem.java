package org.springframework.chapter1.main;

import org.springframework.chapter1.service.EmployeeService;
import org.springframework.chapter1.service.EmployeeServiceImpl;
import org.springframework.chapter2.constructioninjection.Employee;
import org.springframework.chapter2.setterinjection.ATM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PayrollSystem {

	private static ApplicationContext context;

	public static void main(String...args){
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeServiceImpl.class); 
		
		Employee employee = context.getBean("employee", Employee.class);
	
		ATM atm = context.getBean("atmBean", ATM.class);
		
		atm.printBalance(": 7978");
	
		System.out.println(employeeService.generateEmployeeId());

		System.out.println(employee.toString());
		
		// beaninheritance example
		// using 'indianEmployee'
		org.springframework.chapter2.beaninheritance.Employee employeeBean = context.getBean("employeeBean", org.springframework.chapter2.beaninheritance.Employee.class);
		org.springframework.chapter2.beaninheritance.Employee indianEmployee = context.getBean("indianEmployee", org.springframework.chapter2.beaninheritance.Employee.class);
		System.out.println(employeeBean.toString());
		System.out.println(indianEmployee.toString());
		
		
	}
	
}
