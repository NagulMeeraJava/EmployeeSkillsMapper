package com.niit.skillsmapper.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.skillsmapper.model.EmployeeModel;
import com.niit.skillsmapper.model.SkillsModel;

@Repository("employeeDetails")
@Transactional
public class EmployeeOperations implements EmployeeDetails,SkillsDetails
{

	@Autowired
	SessionFactory sf;
	
	@Transactional
	public boolean registerEmployee(EmployeeModel emp) 
	{
		sf.getCurrentSession().save(emp);
	 	return true;
	}
   @Transactional
	public boolean searchEmployeeSkills(SkillsModel skills) {
		
		return true;
	}
    @Transactional
	public boolean updateEmployeeSkills(SkillsModel skills) 
	{
		sf.getCurrentSession().update(skills);
		return true;
		
	}

	public EmployeeModel displayEmployeeDetails(int employee_id) {
		
		EmployeeModel employee=(EmployeeModel)sf.getCurrentSession().get(EmployeeModel.class, employee_id);
		return employee;
		
	}

	public List<EmployeeModel> displayAllEmployees() {
	
		return sf.getCurrentSession().createCriteria(EmployeeModel.class).list();
	}

	public EmployeeModel validateEmployee(String mailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
