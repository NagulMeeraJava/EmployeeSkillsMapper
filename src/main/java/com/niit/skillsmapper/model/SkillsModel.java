package com.niit.skillsmapper.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SkillsModel
{
	private String technical_skills,certifications,languages;
	@Id
	private int years_of_exp;
	private int total_number_of_hours,total_number_of_students,number_of_placedstudents;
	public String getTechnical_skills() {
		return technical_skills;
	}
	public void setTechnical_skills(String technical_skills) {
		this.technical_skills = technical_skills;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public int getYears_of_exp() {
		return years_of_exp;
	}
	public void setYears_of_exp(int years_of_exp) {
		this.years_of_exp = years_of_exp;
	}
	public int getTotal_number_of_hours() {
		return total_number_of_hours;
	}
	public void setTotal_number_of_hours(int total_number_of_hours) {
		this.total_number_of_hours = total_number_of_hours;
	}
	public int getTotal_number_of_students() {
		return total_number_of_students;
	}
	public void setTotal_number_of_students(int total_number_of_students) {
		this.total_number_of_students = total_number_of_students;
	}
	public int getNumber_of_placedstudents() {
		return number_of_placedstudents;
	}
	public void setNumber_of_placedstudents(int number_of_placedstudents) {
		this.number_of_placedstudents = number_of_placedstudents;
	}

}
