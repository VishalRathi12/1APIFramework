package org.testing.Utilities;

import java.util.regex.Pattern;

public class VaraibleValueReplacement {
	
	
	public static String givenValue(String body, String variableName, String variableValue )
	{
		
		body = body.replaceAll(Pattern.quote("{{"+variableName+"}}"),variableValue);
		return body;
	}

}
