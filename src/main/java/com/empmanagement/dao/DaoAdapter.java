package com.empmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import com.empmanagement.entities.Employee;
import com.empmanagement.utilities.Utils;

public class DaoAdapter implements Dao {
	int id;
	Boolean isUpdated = false;
	Boolean emailPersists = false;

	@Override
	public int create(Employee employee) {
		Utils.getSession().getTransaction();
		id = (int) Utils.getSession().save(employee);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		return id;
	}

	@Override
	public Boolean update(Employee employee) {
		isUpdated = false;
		Utils.getSession().clear();
		Utils.getSession().update(employee);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee employee = Utils.getSession().get(Employee.class, id);
		return employee;
	}

	@Override
	public List<Employee> getEmpList() {
		List<Employee> eList = new ArrayList<Employee>();
		String q = "from Employee";
		Query<Employee> query = Utils.getSession().createQuery(q);
		eList = query.list();
		return eList;
	}

	@Override
	public Boolean deleteAnEmployee(Employee employee) {
		isUpdated = false;
		Utils.getSession().delete(employee);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}

	@Override
	public Employee getEmpByEmailAndPassword(String email, String password) {
		String q = "from Employee where email=:emp and password=:pass";
		Query<Employee> query = Utils.getSession().createQuery(q);
		query.setParameter("emp", email);
		query.setParameter("pass", password);
		Employee employee = query.getSingleResult();
		return employee;
	}

	@Override
	public Boolean verifyEmail(String email) {
		String q = "from Employee where email=:email";
		Query<Employee> query = Utils.getSession().createQuery(q);
		query.setParameter("email", email);
		Employee employee = query.getSingleResultOrNull();
		
		if (employee==null) {
			emailPersists = false;
		} 
		else {
			emailPersists = true;
		}
		return emailPersists;
	}

	@Override
	public int updatePassword(String pass, String em) {
		String q = "update Employee set password=:pass where email=:em";
		Utils.getSession().getTransaction();
		Utils.getSession().getTransaction().begin();
		Query<Employee> query = Utils.getSession().createQuery(q);
		query.setParameter("pass", pass);
		query.setParameter("em", em);
		
//		System.out.println(query.getParameterValue("pass"));
//		System.out.println(query.getParameterValue("em"));
		
		int i = query.executeUpdate();
		Utils.getSession().getTransaction().commit();
		return i;
	}

}
