package org.springframework.chapter2.constructioninjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;

	private String employeeName;
	private int employeeAge;
	private String employeeId;

	public Employee() {
		super();
	}

	Employee(String employeeName, int employeeAge, String employeeId) {
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeId = employeeId;
	}

	Employee(String employeeName, String employeeId, int employeeAge) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	public Set<Object> getSets() {
		return sets;
	}

	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}

	public Map<Object, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}

	@Override
	public String toString() {
		return "Employee Name: " + employeeName + ", Employee Age: "
				+ employeeAge + ", Employee Id: " + employeeId + " list: " + lists + " maps: " + maps + " sets: " + sets;
	}

	
	
}
