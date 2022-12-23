package org.testing.testCases;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.HandleProperties;
import org.testng.annotations.Test;

public class TC8_GetParticularEmployee 
{

	@Test
	public void testcase8() throws IOException
	{
	Properties probject = HandleProperties.loadPropertiesFile("../API_Sep_FW/URI.properties");
	HTTPMethods http=new HTTPMethods(probject);
	http.getRecord("QA_getParticularRecord");
	
	}
}
