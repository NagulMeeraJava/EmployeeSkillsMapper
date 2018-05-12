package com.niit.skillsmapper.dao;

import java.util.List;

import com.niit.skillsmapper.model.EmployeeModel;

public interface EmployeeDetails
{
	public boolean registerEmployee(EmployeeModel emp);
	public EmployeeModel displayEmployeeDetails(int employee_id);
	public List<EmployeeModel> displayAllEmployees();
	public EmployeeModel validateEmployee(String mailId,String password);
	
}
