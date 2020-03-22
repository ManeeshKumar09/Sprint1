package com.cg.healthcaresystem.util;

import java.util.ArrayList;
import java.util.List;
import com.cg.healthcaresystem.dto.UserDto;

public class UserRepository 
{
	private static List<UserDto> userCollectionObject=new ArrayList<UserDto>();
	public static void setUserCollectionObject(List<UserDto> userCollectionObject) 
	{
		
		UserRepository.userCollectionObject = userCollectionObject;
	}
	public static List<UserDto> getUserCollectionObject() 
	{
		return userCollectionObject;
	}
	
	public UserRepository()
	{
		userCollectionObject.add(new UserDto("User","1","Maneesh",7508027308L,"knbvcxvb",20,"M")); 
		userCollectionObject.add(new UserDto("User","2","Sohaib",7552327308L,"asfavav",25," M ")); 
		
		/*for(UserDto index: userCollectionObject )
		{
			System.out.println("User:"+" "+ index.getUserId()+" "+ index.getUserName() +" "+ index.getUserPassword()
			+" "+ index.getContactNo() +" "+ index.getUserEmail() +" "+ index.getUserRole() +" "+ index.getAge() +" "+ index.getGender());
		}*/
	}
}
