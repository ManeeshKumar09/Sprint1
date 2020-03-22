package com.cg.healthcaresystem.dao;

import java.util.ArrayList;
import java.util.List;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
import com.cg.healthcaresystem.util.DiagnosticCenterRepository;

public class DiagnosticCenterDao 
{
	public DiagnosticCenterDao()
	{
		new DiagnosticCenterRepository();
	}

	List<DiagnosticCenterDto> newCenterCollectionObject = new ArrayList<DiagnosticCenterDto>();
	List<DiagnosticCenterDto> newCenterDetailsCollectionObject = DiagnosticCenterRepository.getDiagnosticCenterCollectionObject();
	
	public void setNewCenterCollectionObject(List<DiagnosticCenterDto> newCenterCollectionObject) 
	{	
		this.newCenterCollectionObject = newCenterCollectionObject;
	}
	public List<DiagnosticCenterDto> getNewCenterCollectionObject() 
	{
		return newCenterCollectionObject;
	}

	public List<DiagnosticCenterDto> displayDiagnosticCenterDao() 
	{
		return newCenterDetailsCollectionObject;
	}
}
