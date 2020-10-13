package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidation {

	public static void datavalidate(String expectedData, String jsonPath, Response res)
	{
		String actualData 	= res.jsonPath().get(jsonPath);
		Assert.assertEquals(expectedData, actualData);
	}
	
}
