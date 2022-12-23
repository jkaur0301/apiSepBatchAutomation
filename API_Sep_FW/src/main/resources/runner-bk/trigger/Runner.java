package org.testing.trigger;

import java.io.IOException;

import org.testing.testCases.TC1_PostRequest;
import org.testing.testCases.TC2_GetAllRequest;
import org.testing.testCases.TC3_GetParticularRecord;
import org.testing.testCases.TC4_UpdateRequest;
import org.testing.testCases.TC5_Delete_Request;
import org.testing.testCases.TC6_InsertEmployee;
import org.testing.testCases.TC7_GetAllEmployees;
import org.testing.testCases.TC8_GetParticularEmployee;
import org.testing.testCases.TC9_UpdateRecord;

public class Runner 
{
	public static void main(String[] args) throws IOException {
		TC1_PostRequest tc1=new TC1_PostRequest();
		tc1.testcase1();
		
		TC2_GetAllRequest tc2=new TC2_GetAllRequest();
		tc2.testcase2();
		
		TC3_GetParticularRecord tc3=new TC3_GetParticularRecord();
		tc3.testcase3();
		
		TC4_UpdateRequest tc4=new TC4_UpdateRequest();
		tc4.testcase4();	
		TC5_Delete_Request tc5=new TC5_Delete_Request();
		tc5.testcase5();
		
		/*	TC6_InsertEmployee tc6=new TC6_InsertEmployee();
		tc6.testcase6();
		
		TC7_GetAllEmployees tc7=new TC7_GetAllEmployees();
		tc7.testcase7();
		
		TC8_GetParticularEmployee tc8=new TC8_GetParticularEmployee();
		tc8.testcase8();
		*/
		TC9_UpdateRecord tc9=new TC9_UpdateRecord();
		tc9.testcase8();
	}
}
