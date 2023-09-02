package app;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import app.dtos.Person;
import app.utilities.JsonConverterPerson;

public class PersonDemo {
	public static void main(String... args ) throws JsonMappingException, JsonProcessingException {
		
		Person person = new Person(1, "Jhon Doe", 20);
		
		JSONObject jsonObject = JsonConverterPerson.personToJson(person);
		
		System.out.println(jsonObject.toString());
		
		Person person1 = new Person();
		person1 = JsonConverterPerson.jsonToPerson(jsonObject);
		
		System.out.println(person1);
		
		Person person2 = new Person();
		person2 = JsonConverterPerson.jsonToPersonOm(jsonObject);
		System.out.println(person2);
	}
}
