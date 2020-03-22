package com.cg.healthcaresystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.exception.UserDefineException;
import com.cg.healthcaresystem.service.UserService;

public class UserServiceTest 
{

	UserService serviceObj = new UserService();
	UserDto userObj = new UserDto();
	
	@Test
	public void addUserService1Test() throws UserDefineException
	{
		userObj.setUserId("124");
		assertEquals(true,serviceObj.addUserService(userObj));
	}
	
	@Test
	public void addUserService2Test() throws UserDefineException
	{
		userObj.setUserName("");
		assertEquals(true,serviceObj.addUserService(userObj));
	}
	
	@Test
	public void addUserService3Test() throws UserDefineException
	{
		userObj.setContactNo(976590L);
		assertEquals(true,serviceObj.addUserService(userObj));
	}
	
	
}
