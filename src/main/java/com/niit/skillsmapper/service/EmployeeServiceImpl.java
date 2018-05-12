package com.niit.skillsmapper.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.skillsmapper.dao.EmployeeDetails;
import com.niit.skillsmapper.dao.SkillsDetails;
import com.niit.skillsmapper.model.EmployeeModel;

@Repository("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{

	@Autowired
	EmployeeDetails edetails;
	SkillsDetails sdetails;
	public boolean registerEmployee(EmployeeModel emp) {
		
		return edetails.registerEmployee(emp);
	}

	public boolean updateEmployee(EmployeeModel employee) {
		
		return false;
	}

	public EmployeeModel displayEmployeeDetails(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EmployeeModel> displayAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeModel validateEmployee(String mailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
