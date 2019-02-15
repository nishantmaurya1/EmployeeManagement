package com.cts.empmgmt.main;

import com.cts.empmgmt.bean.Employee;
import com.cts.empmgmt.service.EmployeeService;
import com.cts.empmgmt.service.EmployeeServiceImpl;

public class Main {
	public static void main(String [] args)
	{
		EmployeeService employeeService= new EmployeeServiceImpl();
		Employee employee=new Employee();
		String result= employeeService.addEmployee(employee);
		if("success".equals(result))
		{
			System.out.println("record added successfully");
		}
		else
		{
			System.out.println("not recorded");
		}
	}
 
}
