package HttpMethods;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Update_DeleteRequest {
  @Test
  public void PutRequest() {
	  
	  PojoData data = new PojoData();
		data.setName("Abhishek");
		data.setJob("Automation QA");
		
	given()
	.contentType("application/json")
	.body(data)
	.when()
	.put("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();
		
  }
  
  @Test
  public void deleterequest() {
	  given()
	  .when()
	  .delete("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(204)
	  .log()
	  .all();
  }
  
 
  
  
  
  
  
  
  
  
}
