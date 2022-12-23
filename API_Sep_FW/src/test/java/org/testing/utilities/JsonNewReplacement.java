
package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonNewReplacement 
{
	public static String jsonData(String bodyData ,String variableValue)
	{
		bodyData=bodyData.replaceAll("QA_updateRecord", variableValue);
		return bodyData;
	}
}

