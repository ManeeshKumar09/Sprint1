package com.cg.healthcaresystem.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import com.cg.healthcaresystem.dto.TestDto;


public class TestRepository 
{
	public static List<TestDto> testCollectionObject=new CopyOnWriteArrayList<TestDto>();
	
	public static void setTestCollectionObject(List<TestDto> testCollectionObject) 
	{
		TestRepository.testCollectionObject = testCollectionObject;
	}
	public static List<TestDto> getTestCollectionObject() 
	{
		return testCollectionObject;
	}
	public TestRepository()
	{
		testCollectionObject.add(new TestDto("1","Blood"));
		testCollectionObject.add(new TestDto("2","X-Ray"));
		testCollectionObject.add(new TestDto("3","CT Scan"));
		testCollectionObject.add(new TestDto("4","ECG"));
		  
		/*for(TestDto index: testCollectionObject )
		{
			System.out.println("Test:"+ index.getTestName()+ index.getTestId());	  
		}*/
	}
}
