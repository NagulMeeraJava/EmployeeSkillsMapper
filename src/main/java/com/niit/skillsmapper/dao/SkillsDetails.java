package com.niit.skillsmapper.dao;

import com.niit.skillsmapper.model.SkillsModel;

public interface SkillsDetails 
{
	public boolean searchEmployeeSkills(SkillsModel skills);
	public boolean updateEmployeeSkills(SkillsModel skills);

}
