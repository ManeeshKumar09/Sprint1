package com.cg.healthcaresystem.dao;

import java.util.ArrayList;
import java.util.List;
import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.util.TestRepository;

public class TestDao 
{
	public TestDao()
	{
		new TestRepository();
	}
 
	List<TestDto> newTestCollectionObject = new ArrayList<TestDto>();
	List<TestDto> newTestDetailsCollectionObject = TestRepository.getTestCollectionObject();
	public void setNewTestCollectionObject(List<TestDto> newTestCollectionObject) 
	{
		this.newTestCollectionObject = newTestCollectionObject;
	}
	public List<TestDto> getNewTestCollectionObject() 
	{
		return newTestCollectionObject;
	}
	
	public List<TestDto> displayTestDao()
	{
		return newTestDetailsCollectionObject;
	}
}
