package com.cg.healthcaresystem.dao;

import java.util.ArrayList;
import java.util.List;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.util.UserRepository;

public class UserDao 
{
	public UserDao()
	{
		new UserRepository();
	}
	
	List<UserDto> newUserCollectionObject = new ArrayList<UserDto>();
	List<UserDto> newUserDetailsCollectionObject = UserRepository.getUserCollectionObject();
	public void setNewUserCollectionObject(List<UserDto> newUserCollectionObject) 
	{
		this.newUserCollectionObject = newUserCollectionObject;
	}
	
	public List<UserDto> getNewUserCollectionObject() 
	{
		return newUserCollectionObject;
	}
	
	public List<UserDto> displayUserDao()
	{
		return newUserDetailsCollectionObject;
	}
	
	public UserDto addUserDao(UserDto userObject) 
	{
		newUserCollectionObject.add(userObject);
    	UserRepository.setUserCollectionObject(newUserCollectionObject);
		return userObject;
	}
}
