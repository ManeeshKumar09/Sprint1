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
	
	public List<TestDto> displayTestService() 
	{
		return testDao.displayTestDao();
	}	
}
