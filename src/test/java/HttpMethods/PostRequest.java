package HttpMethods;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PostRequest {

	// https://reqres.in/api/users
	@Test
	public void postWithHashMap() {

		// RequestPayload
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Nitin");
		data.put("job", "QA");

		given().contentType("application/json") // type of the data format
				.body(data).when().post("https://reqres.in/api/users") // endpoint
				.then().statusCode(201).body("name", equalTo("Nitin")) // validating the name in the response.
				.log().body();

	}

	@Test
	public void post_Pojo() {

		// payload
		PojoData data = new PojoData();
		data.setName("Sachin");
		data.setJob("SDET");

		given().contentType("application/json") // type of the data format
				.body(data).when().post("https://reqres.in/api/users") // endpoint
				.then().statusCode(201).body("name", equalTo("Sachin")) // validating the name in the response.
				.log().body();

	}

}
