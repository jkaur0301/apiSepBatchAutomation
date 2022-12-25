package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testing.testSteps.HTTPMethods;

public class TC1_PostRequest 
{
	static String residvalue;
	@Test
	public  void testcase1() throws IOException 
	{
		Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
		String inputBodydata= HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/Request.json");
	//	System.out.println("Please enter id value: ");
	//	Scanner s=new Scanner(System.in);
	//	String idvalue=s.next() ;
		
	//	String updateBodyData=JsonReplacement.jsonDataVariableValue(inputBodydata, "id", idvalue);
		
		Random r=new Random();
		Integer idvalue=r.nextInt();
		String updateBodyData=JsonReplacement.jsonDataVariableValue(inputBodydata, "id", idvalue.toString());
		HTTPMethods http=new HTTPMethods(probject);
		Response resObject=http.postrequest("QA_URI", updateBodyData);
		residvalue=JsonParsingUsingJsonPath.jsonParse(resObject,"id");
		
	}
	
}
