package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidation {
	
	
	public static void validatetheStatusCode(int expectedStatusCode, Response res)
	{
		Assert.assertEquals(expectedStatusCode, res.statusCode());
	}

}
