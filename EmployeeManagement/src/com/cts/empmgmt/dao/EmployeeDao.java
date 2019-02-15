package com.cts.empmgmt.dao;

import java.util.List;

import com.cts.empmgmt.bean.Employee;

public interface EmployeeDao {
	
	public String addEmployee(Employee employee);  
	public String updateEmployee(String id,Employee employee);
	public String deleteEmployee(String id);
	public Employee getEmployee(String id);
	public List<Employee> getEmployeesByName(String name);
	public List<Employee> getEmployees();

}
