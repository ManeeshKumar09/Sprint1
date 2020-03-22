package com.cg.healthcaresystem.service;

import java.util.List;

import com.cg.healthcaresystem.dao.UserDao;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.exception.UserDefineException;
//import com.cg.healthcaresystem.exception.InvalidUserDetailsException;

public class UserService 
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
	public UserDto addUserService(UserDto userObject) throws UserDefineException 
	{		
		UserDto result=null;
	    if(String.valueOf(userObject.getUserId()).length()>=4)
	    {
	    	if(!(userObject.getUserName()).isEmpty()) 
	    	{	
	    		if(String.valueOf(userObject.getContactNo()).length()==10) 
	    		{
	    				UserDao userService=new UserDao();
	    				result=userService.addUserDao(userObject);
	    		}
	    		else
	    			throw new UserDefineException("contact Number should be of 10 digit");
	    	}
	    	else
	    		throw new UserDefineException("Name can not be Null");
	    }
	    else
	    	throw new UserDefineException("Id should be greater than 4 digits!");
	    	
	    if(result!=null) 
	    {
	    	throw new UserDefineException("User Registered");
	    }
	    else 
	    {
	    	return result;
	    }
	    
		/*if(userDaoObject.addUserDao(userObject))
		{
			return "Added";
		}
		else
		{
			return "Not Added";
		}*/
	}

	/*public UserDto UserValidation(String uRole, String uId, String uName, long uContact,
			String uMail, int uAge, String uGender) 
	{
		String userRole=uRole, userId=uId, userName=uName, userEmail=uMail, userGender=uGender;
		long contactNo=uContact;
		int userAge=uAge;
		//int uId = (Integer) userId;
    	UserService userServiceObj = new UserService();
    	UserDto userDtoObj=new UserDto(userRole,userId,userName,uContact, userEmail,uAge, userGender);
    	try 
    	{
			userDtoObj=userServiceObj.addUserService(userDtoObj);	
		}   
		catch(UserDefineException e) 
    	{
			System.out.println(e.getMessage());
		}
    	return (userDtoObj.getUserId()+" "+ userDtoObj.getUserName() +" "+
    	userDtoObj.getContactNo() +" "+ userDtoObj.getUserEmail() +" "+ userDtoObj.getUserRole() +" "+ userDtoObj.getAge() +" "+ userDtoObj.getGender());
	}*/	
}

	