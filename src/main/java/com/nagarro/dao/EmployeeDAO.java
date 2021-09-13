package com.nagarro.dao;

import java.util.List;

import com.nagarro.entity.Employee;

public interface EmployeeDAO {
public List<Employee> getEmployees();

public void saveEmployee(Employee emp);

public Employee getEmployee(int id);

public void deleteEmployee(int id);
}
