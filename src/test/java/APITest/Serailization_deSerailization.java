package APITest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import HttpMethods.PojoData;

public class Serailization_deSerailization {

	@Test(priority=1)
	public void serailization() throws JsonProcessingException {
		
		PojoData data = new PojoData();
		data.setName("Abhishek");
		data.setJob("Automation QA");
		
		
		//Mapper class for conversion
	ObjectMapper objMap= new ObjectMapper();
	String jsonData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(data);
	System.out.println("Json format data " +jsonData);
			
	}
	
	@Test(priority=2)
	public void De_serailization() throws JsonMappingException, JsonProcessingException {
		
		System.out.println("========================================================");
		String jsonData="{\r\n"
				+ "  \"name\" : \"Abhishek\",\r\n"
				+ "  \"job\" : \"Automation QA\"\r\n"
				+ "}";
		
		//Object mapper class conversion
		ObjectMapper obj = new ObjectMapper();
	     PojoData pojo = 	obj.readValue(jsonData, PojoData.class);
	     System.out.println("data in pojo format Name  "+ pojo.getName());
	     System.out.println("data in pojo format job  "+ pojo.getJob());
	}
	
	
	
	
	
	
	
	
}
