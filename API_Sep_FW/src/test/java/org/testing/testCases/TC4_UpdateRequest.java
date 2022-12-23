package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

public class TC4_UpdateRequest
{
	@Test
	public void testcase4() throws IOException
	{
		
		//----------Put Request-----------// 
	Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
	String inputBodydata= HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/RequestBodyForUpdate.json");
	String updateBodyData=JsonReplacement.jsonDataVariableValue(inputBodydata, "id", TC1_PostRequest.residvalue);
	HTTPMethods http=new HTTPMethods(probject);
	http.updateFirstname("QA_URI",TC1_PostRequest.residvalue, updateBodyData);
	
	}
}
