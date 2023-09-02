package app.utilities;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.dtos.Person;

public class JsonConverterPerson {
	
	public static JSONObject personToJson(Person person) {
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", person.getId());
		jsonObject.put("name", person.getName());
		jsonObject.put("age", person.getAge());
		
		return jsonObject;
	}
	
	public static Person jsonToPerson(JSONObject jsonObject) {
		Person person  = new Person();
		person.setId(jsonObject.getInt("id"));
		person.setName(jsonObject.getString("name"));
		person.setAge(jsonObject.getInt("age"));
		return person;
	}
	
	public static Person jsonToPersonOm(JSONObject jsonObject) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper om = new ObjectMapper();
		Person person = new Person();
		
		person = om.readValue(jsonObject.toString(), Person.class);
		
		return person;
	}
}
