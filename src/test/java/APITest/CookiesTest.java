package APITest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesTest {
	@Test
	public void getAllcookies() {

		given().when().get("https://google.com").then().log().cookies();
	}

	@Test
   public void getSingleCookies() {
	  
//	  "AEC=AVYB7crqZqgZCw4-IvpYnse_RRbh-qG3qHiV5_4Wa2QsEq14_M35UBN58A;Path=/;Domain=.google.com;Secure;HttpOnly;Expires=23/04/25, 3:49 pm;SameSite=lax\n"
//	  + "NID=518=1ZyvE958tEg12U7Zzp2bFW1IPhsYd4qABfLXjRKxZKOQB-vualztjUnMcv6zizkSifuVarviZmLhfflxi9YIrIV5cf8CFythIe-Y-NQ7g38u0NJlipev56wbsmwiRHOzaOj8JpXiiO1yIF-Tk9l8BpiqS_bKIEbjTqSUTdMPSe7Aju8lvy1PYP-RVRvf4dgUhyHj;Path=/;Domain=.google.com;HttpOnly;Expires=26/04/25, 3:49 pm\n"
//	  + "PASSED: getAllcookies"
	  //response class (interface)
	 Response res = given()
	  .when()
	  .get("https://google.com");
	 
	System.out.println("get single cookies from response "+res.cookie("AEC"));
	  
  }
}
