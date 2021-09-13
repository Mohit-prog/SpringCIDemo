package com.nagarro.service;

import java.util.List;

import com.nagarro.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();

	public void saveEmployee(Employee emp);

	public Employee getEmployee(int id);

	public void deleteEmployee(int id);

}
