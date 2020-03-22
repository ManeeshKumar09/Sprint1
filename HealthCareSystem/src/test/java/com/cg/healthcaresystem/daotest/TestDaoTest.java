package com.cg.healthcaresystem.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.cg.healthcaresystem.dao.TestDao;
import com.cg.healthcaresystem.dto.TestDto;
import com.cg.healthcaresystem.util.TestRepository;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestDaoTest
{
	TestDao testDaoObj=new TestDao();
	TestDto testDtoObj=new TestDto();

	@Test
	public void displayTestTest()
	{
		assertThat(TestRepository.getTestCollectionObject(),is(testDaoObj.displayTestDao()));
	}
	
	///---------------------Testing Test-----------------//
	/*@Test
	public void addTest1Test() 
	{
	   testDtoObj.setTestId("123");
	   testDtoObj.setTestName("abc");  
	   assertEquals(true,testDaoObj.addTestDao(testDtoObj));
	}
	
	public void addTest2Test() 
	{
	   testDtoObj.setTestId("");
	   testDtoObj.setTestName("abc");
	   assertEquals(true,testDaoObj.addTestDao(testDtoObj));
	}*/
}
