package org.springframework.chapter2.autowiring;

import org.springframework.chapter1.service.EmployeeDao;
import org.springframework.chapter1.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao = null;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	@Override
	public Long generateEmployeeId() {
		// TODO Auto-generated method stub
		return null;
	}
}