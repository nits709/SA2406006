package APITest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Headers {
	
  @Test
  public void GetAllHeaders() {
	  given().when().get("https://google.com").then().log().headers();
  }
  
  @Test
  public void GetSingleHeaders() {
	 Response res =  given().when().get("https://google.com");
	 System.out.println("Single header value is "+res.getHeader("Content-Type"));
  }
  
  @Test
  public void GetALLHeadersfromResponse() {
	 Response res =  given().when().get("https://google.com");
	 System.out.println("Single header value is "+res.headers()); 	 
  }
  
  
  
  
  
}
