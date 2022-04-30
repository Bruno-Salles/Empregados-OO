package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Integer payDay;
	
	private Address address;
	private List<Employee> employeeList = new ArrayList<>();
	
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}
	
	public Double payRoll() {
		double sum = 0.0;
		for (Employee employee : employeeList) {
			sum += employee.getSalary();
		}	
		return sum;
	}		
}
