package com.empmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import com.empmanagement.entities.Employee;
import com.empmanagement.utilities.Utils;

public class DaoAdapter implements Dao {
	int id;
	Boolean isUpdated = false;

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

}
