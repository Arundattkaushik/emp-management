package com.empmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "employee_name")
	private String name;
	
	@Column(name = "employee_mobile")
	private String mobile;
	
	@Column(name = "employee_gender")
	private String gender;
	
	@Column(name = "employee_dob")
	private String dob;
	
	@Column(name = "employee_email")
	private String email;
	
	@Column(name = "employee_password")
	private String password;
	
	@Column(name = "employee_type")
	private String empType;
	
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public Employee(int id, String name, String mobile, String gender, String dob, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.password = password;
	}
	
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", dob=" + dob
				+ ", email=" + email + ", password=" + password + "]";
	}
}
