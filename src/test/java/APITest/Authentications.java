package APITest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Authentications {
	@Test
	public void BasicAuthentication() {

		given().auth().basic("postman", "password").when().get("https://postman-echo.com/basic-auth").then()
				.statusCode(200).body("authenticated", equalTo(true)).log().all();
	}

	@Test
	public void DigestAuthentication() {

		given().auth().digest("postman", "password").when().get("https://postman-echo.com/basic-auth").then()
				.statusCode(200).body("authenticated", equalTo(true)).log().all();
	}

	@Test
	public void PremeetiveAuthentication() {

		given().auth().preemptive().basic("postman", "password").when().get("https://postman-echo.com/basic-auth")
				.then().statusCode(200).body("authenticated", equalTo(true)).log().all();
	}

	

	@Test
	public void BrearerAuthentication() {

		String bearerToken = "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";
		given().headers("Authorization", "Bearer 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").when()
				.get("https://api.github.com/user/repos").then().statusCode(200).log().all();
	}

	@Test
	public void testOauthAuthentication() {

		given().auth().oauth("consumerkey", "consumersecret", "accessToken", "tokenSecret").when().get("endPoints")
				.then().statusCode(200).log().all();
	}

	@Test
	public void testOauth2Authentication() {
		given().auth().oauth2("accessToken").when().get("endPoints").then().statusCode(200).log().all();
	}

}
