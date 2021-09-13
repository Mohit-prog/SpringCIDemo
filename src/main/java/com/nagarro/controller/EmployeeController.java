package com.nagarro.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.dao.EmployeeDAO;
import com.nagarro.entity.Employee;
import com.nagarro.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	//inject employeeService
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/list")
	public String listEmployees(Model model) {
		
		List<Employee> employees=employeeService.getEmployees();
		
		
		model.addAttribute("employees",employees);
		
		return "list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Employee emp=new Employee();
		
		model.addAttribute("employee",emp);
		return "employee-add-form";
		
	}
	@GetMapping("/logout")
	public String logout(Model model) {
		
		return "redirect:/";
		
	}
	
	@PostMapping("/saveEmployee")
	  public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		
		
	//save employeee
		employeeService.saveEmployee(emp);
		
		
		
	
		return "redirect:/employee/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int id,Model model) {
		
		//get customer  from service
		Employee emp=employeeService.getEmployee(id); 
		
		//set customer as model to prepopulate the form
		model.addAttribute("employee",emp);
		
		//send to form
		
		return "employee-add-form";
	}
	
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("employeeId") int id) {
		
		employeeService.deleteEmployee(id);
		
		return "redirect:/employee/list";
	}
	
	@PostMapping("/signin")
	public void validateManager(HttpServletRequest request, HttpServletResponse response) throws IOException {

	

		response.sendRedirect("list");

	}
	
	
	
	}
	


