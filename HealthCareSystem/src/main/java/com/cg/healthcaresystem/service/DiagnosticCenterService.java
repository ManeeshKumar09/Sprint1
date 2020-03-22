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

	/*public String addDiagnosticCenterService(DiagnosticCenterDto center) throws UserDefineException
	{
		if(String.valueOf(center.getCenterId()).length()==0)
		{	
			throw new UserDefineException(" Diagnostic Center id cannot be zero!!");
		}
		if(String.valueOf(center.getCenterId()).length() < 4)
		{	
			throw new UserDefineException(" Diagnostic Center id cannot be less than 4 digits!!"); 
		}
		if(centerDao.addDiagnosticCenterDao(center))
		{
			return "Added";
		}
		else
		{
			return "Not Added";
		}
	}*/

	public List<DiagnosticCenterDto> displayDiagnosticCenterService() 
	{
		return centerDao.displayDiagnosticCenterDao();
	}	
}
