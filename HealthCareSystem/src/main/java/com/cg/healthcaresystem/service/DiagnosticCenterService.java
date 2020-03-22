package com.cg.healthcaresystem.service;

import java.util.List;
import com.cg.healthcaresystem.dao.DiagnosticCenterDao;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
//import com.cg.healthcaresystem.exception.UserDefineException;

public class DiagnosticCenterService 
{
	DiagnosticCenterDao centerDao;

	public DiagnosticCenterService()
	{
		centerDao = new DiagnosticCenterDao();
	}

	public void setDiagnosticCenterDao(DiagnosticCenterDao centerDao) 
	{
		this.centerDao = centerDao;
	}
	public DiagnosticCenterDao getDiagnosticCenterDao() 
	{
		return centerDao;
	}

	public List<DiagnosticCenterDto> displayDiagnosticCenterService() 
	{
		return centerDao.displayDiagnosticCenterDao();
	}	
}
