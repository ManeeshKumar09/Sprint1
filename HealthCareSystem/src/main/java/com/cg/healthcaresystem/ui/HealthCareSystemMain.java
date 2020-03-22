package com.cg.healthcaresystem.ui;

import com.cg.healthcaresystem.service.DiagnosticCenterService;
import com.cg.healthcaresystem.service.TestService;
import com.cg.healthcaresystem.service.UserService;
import com.cg.healthcaresystem.dto.UserDto;
import com.cg.healthcaresystem.exception.UserDefineException;
import com.cg.healthcaresystem.dto.DiagnosticCenterDto;
import com.cg.healthcaresystem.dto.TestDto;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class HealthCareSystemMain
{
	public static void main(String args[]) throws UserDefineException
	{ 
		//Creating objects of Service Classes
		TestService testServiceObject = new TestService(); 
		UserService userServiceObject = new UserService();
		DiagnosticCenterService centerServiceObject = new DiagnosticCenterService();
		//List<UserDto> userList = new ArrayList<UserDto>();
		
		//Initializing Scanner
		Scanner scanInput = new Scanner(System.in);
		int userInputChoice = 1;
		
		// Start of the UI Loop
		while(userInputChoice != 0) 
		{
			System.out.println("*----------*CHOOSE FOR DETAILS*----------*\n1.User\n2.Diagnostic Center\n0.Exit");
			userInputChoice = scanInput.nextInt();
		
			switch(userInputChoice) 
			{
			//Exit Case
			case 0:
				System.out.print("Thanks and be healthy and safe!!");
				break;
				
			//User Case
			case 1:	
				System.out.println("*----------*USERINTERFACE*----------*\n1.Display\n2.Add");
				userInputChoice=scanInput.nextInt();
		
				switch(userInputChoice) 
				{
				case 1: //To display user detials
					for(UserDto index:userServiceObject.displayUserService())
	    			{
						System.out.print("User:"+" "+ index.getUserId()+" "+ index.getUserName() +" "
						+" "+ index.getContactNo() +" "+ index.getUserEmail() +" "+ index.getUserRole() +" "+ index.getAge() +" "+ index.getGender());
	    				System.out.println();
	    			}
	    		    break;
					
				case 2: //To add user details in database 
					UserDto userObject=new UserDto();
	
					System.out.println("Enter the Role: ");
					String inputUserRole=scanInput.next();
					userObject.setUserId(inputUserRole);
						
					System.out.println("Enter the Patient's Id: ");
					String inputUserId=scanInput.next();
					userObject.setUserId(inputUserId);
					
					System.out.println("Enter the Patient's Name: ");
					String inputUserName=scanInput.next();
					userObject.setUserName(inputUserName);
						
					System.out.println("Enter the Patient's Contact: ");
					long inputUserContact=scanInput.nextLong();
					userObject.setContactNo(inputUserContact);
					
					System.out.println("Enter the Patient's Mail-id: ");
					String inputUserMail=scanInput.next();
					userObject.setUserEmail(inputUserMail);
							
					System.out.println("Enter the Patient's Age : ");
					int inputUserAge=scanInput.nextInt();
					userObject.setAge(inputUserAge);
					
					System.out.println("Enter the Patient's Gender: ");
					String inputUserGender=scanInput.next();
					userObject.setGender(inputUserGender);
					
					//userList.add(new UserDto(String userRole,String userId,String userName,long contactNo,String userEmail,int age,String gender));
					//System.out.println(UserService.UserValidation(inputUserRole, inputUserId, inputUserName, inputUserContact, inputUserMail, inputUserAge,inputUserGender);
					
				}
				break;
				
			// Diagnostic Center Case
			case 2: 
				System.out.println("*---------------*DIAGNOSTIC CENTER DETAILS*---------------*\n1.Display\n2.Select Diagnostic Center\n");
				userInputChoice=scanInput.nextInt();
					
				switch(userInputChoice) 
				{
				case 1: // Displaying diagnostic centers
					for(DiagnosticCenterDto index:centerServiceObject.displayDiagnosticCenterService())
					{
						System.out.print("CenterId "+index.getCenterId()+" "+"Center: "+index.getCenterName());
						System.out.println();
					}
				    break;
				case 2: 
					for(DiagnosticCenterDto index:centerServiceObject.displayDiagnosticCenterService())
					{
						System.out.print("CenterId "+index.getCenterId()+" "+"Center: "+index.getCenterName());
						System.out.println();
					}
					System.out.println("*----------*CHOOSE FROM DIAGNOSTIC CENTER*----------*");
					userInputChoice = scanInput.nextInt();
					switch(userInputChoice)
					{
					case 1:	
						for(TestDto index:testServiceObject.displayTestService())
						{
							System.out.print("Test id is: "+index.getTestId()+"Test name is: "+index.getTestName());
							System.out.println();
						}
						break;
					case 2:	
						for(TestDto index:testServiceObject.displayTestService())
						{
							System.out.print("Test id is: "+index.getTestId()+"Test name is: "+index.getTestName());
							System.out.println();
						}
						break;
					case 3:	
						for(TestDto index:testServiceObject.displayTestService())
						{
							System.out.print("Test id is: "+index.getTestId()+"Test name is: "+index.getTestName());
							System.out.println();
						}
						break;
					case 4:	
						for(TestDto index:testServiceObject.displayTestService())
						{
							System.out.print("Test id is: "+index.getTestId()+"Test name is: "+index.getTestName());
							System.out.println();
						}
						break;
					default:
						System.out.print("Choose from given Centers");
						break;
					}	
				}	
			}
		scanInput.close();
		}
	}
}