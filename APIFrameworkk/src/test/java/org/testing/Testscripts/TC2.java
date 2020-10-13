package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.json.HTTP;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.Teststeps.HTTPMethods;
import org.testing.Utilities.PropertiesLoad;

import com.jayway.restassured.response.Response;

public class TC2 {

	public void testcase2() throws IOException
	{
		Properties pr = PropertiesLoad.loadfile("..//APIFrameworkk/Env.proper");// First Load Property file
		
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.getRequest("QA_URI", TC1.id);
		System.out.println("status code is");
		System.out.println(res.statusCode());
		
		ResponseStatusCodeValidation.validatetheStatusCode(200, res);
		
		System.out.println("data is");
		System.out.println(res.asString());
		
		
	}
	
	
	
}



