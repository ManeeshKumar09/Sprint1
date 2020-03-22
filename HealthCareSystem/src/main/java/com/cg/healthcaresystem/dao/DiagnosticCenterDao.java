package com.cg.healthcaresystem.dao;


import java.util.List;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
import com.cg.healthcaresystem.util.DiagnosticCenterRepository;

public class DiagnosticCenterDao 
{
	public DiagnosticCenterDao()
	{
		new DiagnosticCenterRepository();
	}

	List<DiagnosticCenterDto> newCenterDetailsCollectionObject = DiagnosticCenterRepository.getDiagnosticCenterCollectionObject();
	
	

	public List<DiagnosticCenterDto> displayDiagnosticCenterDao() 
	{
		return newCenterDetailsCollectionObject;
	}
}
