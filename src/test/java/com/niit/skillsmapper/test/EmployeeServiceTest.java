package com.niit.skillsmapper.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.skillsmapper.config.SkillsMapperApplication;
import com.niit.skillsmapper.model.EmployeeModel;
import com.niit.skillsmapper.service.EmployeeService;

public class EmployeeServiceTest {

	EmployeeService service;
	
	@Before
	public void preExecution() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SkillsMapperApplication.class);
		
	service = (EmployeeService)context.getBean("employeeService");
		
		
	}
    @Test
    public void registerEmployeeTest(){
  	  EmployeeModel emp=new EmployeeModel();
  	  emp.setEmployee_id("31765");
  	  emp.setEmployee_fname("nagul");
  	  emp.setEmployee_lname("sahik");
  	  emp.setEmployee_email("nagul@gmail.com");
  	  emp.setEmployee_gender("male");
  	  emp.setMobile_number(9052425905L);
  	  emp.setEmployee_role("Techmentor");
  	  emp.setPassword("12345");
  	 
  	  assertTrue(service.registerEmployee(emp));
  	  
    }

}
