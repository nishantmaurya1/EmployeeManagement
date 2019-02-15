package com.cts.empmgmt.service;

import java.util.List;

import com.cts.empmgmt.bean.Employee;
import com.cts.empmgmt.dao.EmployeeDAOImpl;
import com.cts.empmgmt.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDAO=new EmployeeDAOImpl();
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
