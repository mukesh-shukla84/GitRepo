package pageObjectModel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBinding
{

	public String UserName;
	public String password;
	ObjectMapper mapper = new ObjectMapper();
	DataBinding objData; 
		
	//this is code to read a Json file 
	void readData() throws JsonMappingException, JsonProcessingException
	{
		objData = mapper.readValue(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\Data.json", DataBinding.class);
	}
	
}
