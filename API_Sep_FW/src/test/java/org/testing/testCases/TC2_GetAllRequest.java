package org.testing.testCases;
import java.io.IOException;
import java.util.Properties;

import org.testing.utilities.HandleJsonFile;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;
import org.testing.testSteps.HTTPMethods;

public class TC2_GetAllRequest 
{
	@Test
	public void testcase2() throws IOException
	{
		Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
		String inputBodydata= HandleJsonFile.readJson("../API_Sep_FW/src/test/java/org/testing/resources/Request.json");
		HTTPMethods http=new HTTPMethods(probject);
		http.getAllRequest("QA_URI");
		
		
		
	}
}
