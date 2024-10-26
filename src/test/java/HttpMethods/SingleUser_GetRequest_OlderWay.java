package HttpMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SingleUser_GetRequest_OlderWay {

	@Test
	public void singleUser_Getrequest() {
		Response res =	 RestAssured.get("https://google.com");
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		int actCode = res.getStatusCode();
		Assert.assertEquals(actCode, 200,"AssertFail: Status code in not matching");
	}
	
	
}
