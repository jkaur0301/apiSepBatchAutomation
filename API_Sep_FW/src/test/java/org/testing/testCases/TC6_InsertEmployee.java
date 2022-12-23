package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.http.protocol.HTTP;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testing.utilities.JsonParsingUsingJsonPath;
import org.testing.utilities.JsonReplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class TC6_InsertEmployee
{
	@Test
	public  void testcase6() throws IOException 
	{
	Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
	String inputBodydata= HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/RequestBodyForUpdate.json");
	HTTPMethods http=new HTTPMethods(probject);
	http.postrequest("QA_Employee", inputBodydata);

	}
	
	
	
	
	
}
