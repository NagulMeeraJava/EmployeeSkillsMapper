package com.niit.skillsmapper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeModel 
{   @Id
	private String employee_id;
	@Column
    private String employee_fname,employee_lname,employee_gender,employee_email,Employee_role,password;
	@Column
    private long mobile_number;
	
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_fname() {
		return employee_fname;
	}
	public void setEmployee_fname(String employee_fname) {
		this.employee_fname = employee_fname;
	}
	public String getEmployee_lname() {
		return employee_lname;
	}
	public void setEmployee_lname(String employee_lname) {
		this.employee_lname = employee_lname;
	}
	public String getEmployee_gender() {
		return employee_gender;
	}
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getEmployee_role() {
		return Employee_role;
	}
	public void setEmployee_role(String employee_role) {
		Employee_role = employee_role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

}
