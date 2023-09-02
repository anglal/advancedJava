package app.utilities;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.dtos.Result;

public class JsonConverter {
	public static Result map(JSONObject object) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readValue(object.toString(), Result.class);
		
	}
}
