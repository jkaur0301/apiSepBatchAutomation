package org.testing.utilities;
// input -- body data(that is containing variable also) variablename,variablevalue 
// purpose -- it will replace the variableName with variableValue in the bodydata
//output -- after replacement this method will return the latest string that is containing variable value
import java.util.regex.Pattern;

public class JsonReplacement 
{
	public static String jsonDataVariableValue(String completeBody,String variableName,String variableValue)
	{
		completeBody=completeBody.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return completeBody;
	}


}
