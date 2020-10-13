package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.Teststeps.HTTPMethods;
import org.testing.Utilities.JsonfileLoad;
import org.testing.Utilities.PropertiesLoad;
import org.testing.Utilities.ResponseExtraction;
import org.testing.Utilities.VaraibleValueReplacement;

import com.jayway.restassured.response.Response;

public class TC1 {
static String id;
	
	public void testcase1() throws IOException {
		
	
		Properties pr = PropertiesLoad.loadfile("..//APIFrameworkk/Env.proper");// First Load Property file
		String bodyData = JsonfileLoad.loadfile("..//APIFrameworkk/src/test/java/org/testing/Payload/bodyData.json");//Load BodyDAta File    
		
		
		
		Random r = new Random();//This is for taking randomn value
		Integer v = r.nextInt();//here, in integer v - storing randomn value
		
		bodyData= VaraibleValueReplacement.givenValue(bodyData,"id",v.toString());//Bodydata mai id value replace by integer v
		
		//in this - Firstname ki value provide krni hai
		//bodyData = VaraibleValueReplacement.givenValue(bodyData,"Firstname","DC");
		
		System.out.println("Bodydata is"+bodyData);//print bodydata after replacement
		
		
		HTTPMethods http = new HTTPMethods(pr);//Httpmethods creating object
		Response res = http.postRequest("QA_URI",bodyData);// posting method and storing the value in Response res
		
		System.out.println("status code is"+res.statusCode());// print status code
		
		ResponseStatusCodeValidation.validatetheStatusCode(201, res);
		ResponseDataValidation.datavalidate("vishal", "firstname", res);
		
		
		System.out.println("body is"+res.asString());// print response codes
		
	    id = ResponseExtraction.extractBasedUponJsonPath(res, "id");//json path of id = "id"
		System.out.println("id is"+id);//id ko print krwa diya 
		
		
		
	}
	
}
