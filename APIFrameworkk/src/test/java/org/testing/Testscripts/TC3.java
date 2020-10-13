package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.Teststeps.HTTPMethods;
import org.testing.Utilities.JsonfileLoad;
import org.testing.Utilities.PropertiesLoad;
import org.testing.Utilities.VaraibleValueReplacement;

import com.jayway.restassured.response.Response;

public class TC3 {

	public void testcase3() throws IOException
	{
		
		Properties pr = PropertiesLoad.loadfile("..//APIFrameworkk/Env.proper");// First Load Property file
		String bodyData = JsonfileLoad.loadfile("..//APIFrameworkk/src/test/java/org/testing/Payload/bodyData.json");//Load BodyDAta File    
		
		bodyData= VaraibleValueReplacement.givenValue(bodyData,"id",TC1.id);//Bodydata mai id value replace by integer v
		bodyData= VaraibleValueReplacement.givenValue(bodyData,"firstname","Adhiraaj");
		
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.putRequest("QA_URI",TC1.id,bodyData);
		
		System.out.println("status code is");
		System.out.println(res.statusCode());
		
		System.out.println("data is");
		System.out.println(res.asString());
		
		
		
		
		
		
		
	}
	
	
}
