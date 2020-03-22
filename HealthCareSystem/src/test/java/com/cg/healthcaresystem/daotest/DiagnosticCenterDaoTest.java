package com.cg.healthcaresystem.daotest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import com.cg.healthcaresystem.dao.DiagnosticCenterDao;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
import com.cg.healthcaresystem.util.DiagnosticCenterRepository;

public class DiagnosticCenterDaoTest 
{
	DiagnosticCenterDao centerDaoObj=new DiagnosticCenterDao();
	DiagnosticCenterDto centerDtoObj=new DiagnosticCenterDto();
	
	@Test
	public void displayDiagnosticCenterTest()
	{
		assertThat(DiagnosticCenterRepository.getDiagnosticCenterCollectionObject(),is(centerDaoObj.displayDiagnosticCenterDao()));
	}
	
	/*@Test
	public void addDiagnosticCenter1Test() 
	{
	   centerDtoObj.setCenterId("123");
	   centerDtoObj.setCenterName("abc");
	   assertEquals(true,centerDaoObj.addDiagnosticCenterDao(centerDtoObj));
	}
	
	@Test
	public void addDiagnosticCenter2Test() 
	{
	   centerDtoObj.setCenterId("");
	   centerDtoObj.setCenterName("abc");
	   assertEquals(true,centerDaoObj.addDiagnosticCenterDao(centerDtoObj));
	}*/
}
