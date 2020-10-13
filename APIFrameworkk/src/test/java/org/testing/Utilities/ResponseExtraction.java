package org.testing.Utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtraction {
	
	public static String extractBasedUponJsonPath(Response res, String jsonPath)
	{
		String extractvalue = res.jsonPath().get(jsonPath);
		
		return extractvalue;
	}
	

}
