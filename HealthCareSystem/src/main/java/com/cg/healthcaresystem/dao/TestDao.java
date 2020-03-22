package com.cg.healthcaresystem.dao;


import java.util.List;
import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.util.TestRepository;

public class TestDao 
{
	public TestDao()
	{
		new TestRepository();
	}
 
	List<TestDto> newTestDetailsCollectionObject = TestRepository.getTestCollectionObject();
	
	
	public List<TestDto> displayTestDao()
	{
		return newTestDetailsCollectionObject;
	}
}
