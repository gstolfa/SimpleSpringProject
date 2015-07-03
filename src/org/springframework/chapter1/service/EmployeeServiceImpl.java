package org.springframework.chapter1.service;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void setDaoProperty(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void setDaoPropertyNuovo(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
	
	@Override
	public Long generateEmployeeId() {
		return System.currentTimeMillis();
	}
}
