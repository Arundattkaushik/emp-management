package com.empmanagement.services;

import java.util.ArrayList;
import java.util.List;

import com.empmanagement.dao.Dao;
import com.empmanagement.dao.DaoAdapter;
import com.empmanagement.entities.Employee;



public class Service {

	static Dao dao = new DaoAdapter();
	static int id;
	static Boolean isDeleted = false;
	static Boolean isUpdate = false;
	static Boolean doPersists = false;

	public static int saveEmployee(Employee employee) {
		try {
			id = dao.create(employee);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public static List<Employee> getEmployeeList(){
		List<Employee> elist = new ArrayList<Employee>();
		elist = dao.getEmpList();
		return elist;
	}
	
	public static Boolean deleteEmpoyee(Employee employee) {
		isDeleted = false;
		dao.deleteAnEmployee(employee);
		return isDeleted;
	}
	
	public static Employee getEmployee(int id) {
		Employee employee = dao.getEmployee(id);
		return employee;
	}
	
	public static Boolean updateEmployee(Employee employee) {
		isUpdate = false;
		dao.update(employee);
		isUpdate = true;
		return isUpdate;
	}
	
	
	public static Employee getEmpByEmailAndPassword(String email, String password) {
		
		Employee employee=null;
		try {
			employee = dao.getEmpByEmailAndPassword(email, password);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
		
	}
	
	
	public static Boolean verifyEmail(String email) {
		return dao.verifyEmail(email);	
	}
	
	public static int updatePassword(String password, String email) {
		return dao.updatePassword(password, email);
	}
}
