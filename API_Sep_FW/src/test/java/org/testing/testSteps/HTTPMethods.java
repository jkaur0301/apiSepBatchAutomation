package org.testing.testSteps;

import java.util.Properties;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response postrequest(String uriKey, String bodyData)
	{
		String uriValue= pr.getProperty(uriKey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(uriValue);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		return res;
		
	}
	
	public void getAllRequest(String uriKey)
	{
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(pr.getProperty(uriKey));
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
	}
	public void getParticularRecord(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
	}
	//TC4 - Update request
	public void updateFirstname(String uriKey,String idValue, String bodydata)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
	}
	//TC5 - Delete Request
	
	public void deleRequest(String uriKey,String idValue)
	{
		String uri=pr.getProperty(uriKey)+"/"+idValue;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
	}
	// TC8 - Add employee 
	public void getRecord(String uriKey)
	{
		String uri=pr.getProperty(uriKey);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
	}
	
	//TC9 - Update request
	public void update(String uriKey,String bodydata)
	{
		String uri=pr.getProperty(uriKey);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.put(uri);
		System.out.println("Status Code is ");
		System.out.println(res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
	}
	
}
