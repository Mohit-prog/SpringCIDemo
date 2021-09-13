package com.nagarro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.entity.Employee;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	   
	
	public List<Employee> getEmployees() {
		
		//get current hibernate
		
		Session currentSession=sessionFactory.getCurrentSession();
		
		
		//create query
		Query<Employee> thequery=currentSession.createQuery("from Employee",Employee.class);
		
		//get list 
		List<Employee> employees=thequery.getResultList();
		//return list
		
		return employees;
		
	}


	public void saveEmployee(Employee emp) {
	
		//get session
		Session currentSession=sessionFactory.getCurrentSession();
		
		//save 
		currentSession.saveOrUpdate(emp);
		
		
	}


	public Employee getEmployee(int id) {
		
		//get session
		Session currentSession=sessionFactory.getCurrentSession();
		
		//retrive from database
		Employee emp=currentSession.get(Employee.class,id);
		
		
		return emp;
		
		
		
	}

  
	public void deleteEmployee(int id) {
		//get session
				Session currentSession=sessionFactory.getCurrentSession();
				
	  //delete with id
		Query q=currentSession.createQuery("delete from Employee where id=:employeeId");
		
		q.setParameter("employeeId",id);
		
		
		//execute
		q.executeUpdate();
		
				
	}

	
	
	
}




