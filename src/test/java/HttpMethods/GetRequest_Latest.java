package HttpMethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class GetRequest_Latest {
	
/*
 * given() - pre-requisite
 * headers/cookie/path/query/ requestpayload(resources)/authentication.
 * 
 * When() - send request 
 * GET/POST/PUT/PATCH/DELETE
 * 
 * then() - validate response
 * status code/ response/ response payload/ msg
 * 	
 */	
	@Test
	public void singleUserRequest() {
		//https://reqres.in/api/users/2		
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("data.first_name",equalTo("Janet"))
		.body("data.email",equalTo("janet.weaver@reqres.in"))
		.log().all(); // return complete response from the server.
	}
	
	

}
