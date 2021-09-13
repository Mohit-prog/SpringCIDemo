package com.nagarro.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="employee")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empId")
	@NotNull
	 private int id;
	
	
	@Column(name="empName")
	@NotNull
	private String name;
	
	@Column(name="location")
	@NotNull
	private String location;
	
	@Column(name="email")
	@NotNull
	private String email;
	
	@Column(name="dateOfBirth")
	@NotNull
	private String dob;
	
	
   public Employee() {
	   
   }


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getDob() {
	return dob;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", email=" + email + ", dob=" + dob
			+ "]";
}


public void setDob(String dob) {
	this.dob = dob;
}

}
