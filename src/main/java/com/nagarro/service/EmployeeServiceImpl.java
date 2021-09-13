package com.nagarro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.dao.EmployeeDAO;
import com.nagarro.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	//inject dao
	
	@Autowired
	private EmployeeDAO employeeDAO;
    
	@Transactional
	public List<Employee> getEmployees() {
		
		return employeeDAO.getEmployees();
	}
 
	
	 @Transactional
	public void saveEmployee(Employee emp) {
		
		 employeeDAO.saveEmployee(emp);
		
		
		
	}

 
	 @Transactional
	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
		
	}

  @Transactional
	public void deleteEmployee(int id) {
		employeeDAO.deleteEmployee(id);
		
	}

}





