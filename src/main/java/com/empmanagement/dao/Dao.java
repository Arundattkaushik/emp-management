package com.empmanagement.dao;

import java.util.List;

import com.empmanagement.entities.Employee;

public interface Dao {
	public int create(Employee employee);
	public Boolean update(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getEmpList();
	public Boolean deleteAnEmployee(Employee employee);
}
