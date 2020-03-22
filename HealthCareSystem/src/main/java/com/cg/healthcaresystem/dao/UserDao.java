package com.cg.healthcaresystem.dao;

import java.util.List;


import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.util.UserRepository;

public class UserDao implements ModuleDaoInterface
{
	public UserDao()
	{
		new UserRepository();
	}
	
	List<UserDto> newUserDetailsCollectionObject = UserRepository.getUserCollectionObject();
	
	
	
	public List<UserDto> displayUserDao()
	{
		return newUserDetailsCollectionObject;
	}
	
	public boolean addUserDao(UserDto userObject) 
	{
		newUserDetailsCollectionObject.add(userObject);
		return true;
	}

	
	
	
}
