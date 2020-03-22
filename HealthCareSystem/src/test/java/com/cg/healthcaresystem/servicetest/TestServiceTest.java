package com.cg.healthcaresystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.exception.UserDefineException;
import com.cg.healthcaresystem.service.TestService;

public class TestServiceTest 
{

	TestService testServiceObj = new TestService();
	TestDto testDtoObj = new TestDto();
	
	/*@Test
	public void addTestService1Test() throws UserDefineException
	{
		testDtoObj.setTestName("Patient");
		testDtoObj.setTestId("124");
		assertEquals(true,testServiceObj.addTestService(testDtoObj));
	}
	
	@Test
	public void addTestService2Test() throws UserDefineException
	{
		testDtoObj.setTestName("Patient");
		testDtoObj.setTestId("");
		assertEquals(true,testServiceObj.addTestService(testDtoObj));
	}*/
	
}
