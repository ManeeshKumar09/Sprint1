package com.cg.healthcaresystem.service;

import java.util.List;

import com.cg.healthcaresystem.dao.TestDao;
import com.cg.healthcaresystem.dto.TestDto;
//import com.cg.healthcaresystem.exception.UserDefineException;

public class TestService 
{
	TestDao testDao;
	//Constructor 
	public TestService()
	{
		testDao = new TestDao();
	}
	public void setTestDao(TestDao testDao) 
	{
		this.testDao = testDao;
	}
	public TestDao getTestDao() 
	{
		return testDao;
	}
	
	/*public String addTestService(TestDto test) throws UserDefineException
	{
		if(String.valueOf(test.getTestId()).length()==0)
		{	
			throw new UserDefineException(" Diagnostic Center id cannot be zero!!");
		}
		if(String.valueOf(test.getTestId()).length()<4)
		{	
			throw new UserDefineException(" Diagnostic Center id cannot be less than 4 digits!!"); 
		}
		
		if(testDao.addTestDao(test))
		{
			return "Added";
		}
		else
		{
			return "Not Added";
		}
		//return (testDao.addTestDao(test));
	}*/
	
	public List<TestDto> displayTestService() 
	{
		return testDao.displayTestDao();
	}	
}
