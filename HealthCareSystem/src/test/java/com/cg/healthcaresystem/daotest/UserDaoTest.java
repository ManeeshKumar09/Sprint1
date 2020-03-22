package com.cg.healthcaresystem.daotest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.cg.healthcaresystem.dao.UserDao;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.util.UserRepository;

public class UserDaoTest 
{
	UserDao userDaoObj=new UserDao();
	UserDto userDtoObject=new UserDto();

	@Test
	public void displayUserTest()
	{
		assertThat(UserRepository.getUserCollectionObject(),is(userDaoObj.displayUserDao()));
	}
	
	@Test
	public void addUser1Test() 
	{
	   userDtoObject.setUserId("123");
	   userDtoObject.setUserName("abc");
	   assertEquals(true,userDaoObj.addUserDao(userDtoObject));   
	}

	@Test
	public void addUser2Test() 
	{
	   userDtoObject.setUserId("");
	   userDtoObject.setUserName("abc");
	   assertEquals(true,userDaoObj.addUserDao(userDtoObject));   
	}
	
}
