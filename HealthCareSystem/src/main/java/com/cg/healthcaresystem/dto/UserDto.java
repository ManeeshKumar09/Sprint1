package com.cg.healthcaresystem.dto;

public class UserDto
{
	String userId;
	String userName;
	long contactNo;
	String userEmail;
	String userRole;
	int age;
	String gender;
	
	// HashMap<UserDto> userList = new HashMap<UserDto>();
	
	
	public UserDto(String userRole,String userId,String userName,long contactNo,String userEmail,int age,String gender)
	{
		this.userId=userId;
		this.userName=userName;
		this.contactNo=contactNo;                                                                                                              
		this.userEmail=userEmail;
		this.userRole = userRole;
		this.age = age;
		this.gender = gender;
	}

	public UserDto() {}

	public void setUserRole(String userRole) 
	{
		this.userRole = userRole;
	}
	public String getUserRole() 
	{
		return userRole;
	}
	
	public void setUserId(String userId) 
	{
		this.userId = userId;
	}
	public String getUserId() 
	{
		return userId;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	
	public void setContactNo(long contactNo) 
	{
		this.contactNo = contactNo;
	}
	public long getContactNo() 
	{
		return contactNo;
	}
	
	public void setUserEmail(String userEmail) 
	{
		this.userEmail = userEmail;
	}
	public String getUserEmail() 
	{
		return userEmail;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getAge() 
	{
		return age;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getGender() 
	{
		return gender;
	}
}
