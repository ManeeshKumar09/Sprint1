package com.cg.healthcaresystem.dao;

import java.util.List;


import com.cg.healthcaresystem.dto.UserDto;

public interface ModuleDaoInterface 
{
	
	abstract List<UserDto> displayUserDao();
	abstract boolean addUserDao(UserDto userObject);

}
