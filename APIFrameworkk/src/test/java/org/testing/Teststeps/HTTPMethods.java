package org.testing.Teststeps;

import java.util.Properties;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
	}
	
	
	public Response postRequest(String urikey, String body)
	{
		Response res = given()
		.contentType(ContentType.JSON)
		.body(body)
		.when()
		.post(pr.getProperty(urikey));

		
		return res;	
	}
	
	public Response getRequest(String uriKey,String id)
	{
		String uri = pr.getProperty(uriKey)+"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		
		
		
		
		return res;
		
	}
	
	public Response putRequest(String uriKey,String id, String body)
	{
		String uri = pr.getProperty(uriKey)+"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(uri);
	
		return res;
		
	}
	
	public Response deleteRequest(String uriKey,String id)
	{
		String uri = pr.getProperty(uriKey)+"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.delete(uri);
	
		return res;
		
	}
	
	
	
	
	
	

}
