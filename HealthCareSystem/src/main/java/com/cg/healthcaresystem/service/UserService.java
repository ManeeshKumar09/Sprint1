package com.cg.healthcaresystem.service;

import java.util.List;

import com.cg.healthcaresystem.dao.UserDao;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.exception.UserDetailException;

public class UserService implements ModuleServiceInterface
{
	UserDao userDaoObject;
	
	public UserService()
	{
		userDaoObject=new UserDao();
	}

	public List<UserDto> displayUserService() 
	{
		return userDaoObject.displayUserDao();
	}
	
	//User Functionalities    
	public String addUserService(UserDto userObject) throws UserDetailException 
	{	
		if((String.valueOf(userObject.getUserId()).length())<4)
		{
			throw new UserDetailException(" User id cannot be less than 4 digits!!");
		}
		if((String.valueOf(userObject.getUserId()).length())==0)
		{
			throw new UserDetailException(" User id cannot be zero!!");
		}
		
		if((String.valueOf(userObject.getUserName()).length())<4)
		{
			throw new UserDetailException(" User name cannot be less than 4 digits!!");
		}
		if((String.valueOf(userObject.getUserName()).length())==0)
		{
			throw new UserDetailException(" User name cannot be zero!!");
		}
		
		if((String.valueOf(userObject.getContactNo()).length())<10)
		{
			throw new UserDetailException(" User contact number cannot be less than 10 digits!!");
		}
		if((String.valueOf(userObject.getContactNo()).length())==0)
		{
			throw new UserDetailException(" User contact number cannot be zero!!");
		}
		
		if(userDaoObject.addUserDao(userObject))
		{
			return "Added";
			
		}
		else
		{
			return "Not Added";
		}
		
	}	
}
	

	