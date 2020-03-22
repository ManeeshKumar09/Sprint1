package com.cg.healthcaresystem.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
import com.cg.healthcaresystem.exception.UserDefineException;
import com.cg.healthcaresystem.service.DiagnosticCenterService;

public class DiagnosticCenterServiceTest 
{
	DiagnosticCenterService centerServiceObj = new DiagnosticCenterService();
	DiagnosticCenterDto centerDtoObj = new DiagnosticCenterDto();
	
	/*@Test
	public void addCenterService1Test() throws UserDefineException
	{
		centerDtoObj.setCenterName("Patient");
		centerDtoObj.setCenterId("124");
		assertEquals(true,centerServiceObj.addDiagnosticCenterService(centerDtoObj));
	}
	
	@Test
	public void addCenterService2Test() throws UserDefineException
	{
		centerDtoObj.setCenterName("Patient");
		centerDtoObj.setCenterId("");
		assertEquals(true,centerServiceObj.addDiagnosticCenterService(centerDtoObj));
	}*/
}
