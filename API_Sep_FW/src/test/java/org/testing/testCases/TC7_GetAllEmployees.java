package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;

public class TC7_GetAllEmployees 
{
	@Test
	public void testcase7() throws IOException
	{
		Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
		//String inputBodydata= HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/RequestBodyForUpdate.json");
		HTTPMethods http=new HTTPMethods(probject);
		http.getAllRequest("QA_FetchRecords");
		
		
		
	}
}