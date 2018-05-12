package com.niit.skillsmapper.service;

import java.util.List;

import com.niit.skillsmapper.model.EmployeeModel;

public interface EmployeeService 
{
	public boolean registerEmployee(EmployeeModel emp);
	public boolean updateEmployee(EmployeeModel employee);
	public EmployeeModel displayEmployeeDetails(int employeeId);
	public List<EmployeeModel> displayAllEmployees();
	public EmployeeModel validateEmployee(String mailId,String password);
	
}
