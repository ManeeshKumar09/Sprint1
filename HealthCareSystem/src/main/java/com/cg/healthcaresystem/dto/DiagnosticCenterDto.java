package com.cg.healthcaresystem.dto;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenterDto 
{
	private String centerName;
	private String centerId;
	private List<TestDto> listOfTests=new ArrayList<TestDto>();
	
	public DiagnosticCenterDto() {}
	
	public DiagnosticCenterDto(String centerId , String centerName)
	{
		this.centerName=centerName;
		this.centerId=centerId;
	}
	
	public void setCenterName(String centerName)
	{
		this.centerName = centerName;
	}
	public String getCenterName() 
	{
		return centerName;
	}
	
	public void setCenterId(String centerId) 
	{
		this.centerId = centerId;
	}
	public String getCenterId() 
	{
		return centerId;
	}
	
	public void setListOfTests(List<TestDto> listOfTests) 
	{
		this.listOfTests = listOfTests;
	}
    public List<TestDto> getListOfTests() 
    {
		return listOfTests;
	}

}
