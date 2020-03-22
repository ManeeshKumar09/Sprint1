package com.cg.healthcaresystem.util;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;

public class DiagnosticCenterRepository 
{

	public static List<DiagnosticCenterDto> centerCollectionObject=new  CopyOnWriteArrayList<DiagnosticCenterDto>();
	
	public static void setDiagnosticCenterCollectionObject(List<DiagnosticCenterDto> diagnosticCenterCollectionObject) 
	{
		DiagnosticCenterRepository.centerCollectionObject = diagnosticCenterCollectionObject;
	}
	public static List<DiagnosticCenterDto> getDiagnosticCenterCollectionObject()
	{
		return centerCollectionObject;
	}
   
	static
	{
		centerCollectionObject.add(new DiagnosticCenterDto("1","Jalandhar"));
		centerCollectionObject.add(new DiagnosticCenterDto("2","Phagwara"));
		centerCollectionObject.add(new DiagnosticCenterDto("3","Amritsar"));
		centerCollectionObject.add(new DiagnosticCenterDto("4","Chandigarh"));
		
		/*for(DiagnosticCenterDto index: DiagnosticCenterCollectionObject )
		{
			System.out.println("Center:"+ index.getCenterName()+ index.getCenterId());	  
		}*/
	}

}
