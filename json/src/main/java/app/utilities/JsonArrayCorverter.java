package app.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import app.dtos.Person;

public class JsonArrayCorverter {

	public static JSONArray peopleToJsonArray(List<Person> people) {
		
		JSONArray jsonArray = new JSONArray();
		int i = 0;
		for(Person p: people) {
			jsonArray.put(i++, JsonConverterPerson.personToJson(p));
		}
		//TODO
		return jsonArray;
	}
	
	public static List<Person> jsonArrayToPeople(JSONArray array){
		
		List<Person> people = new ArrayList<>();
		
		for(int i = 0; i < array.length(); i++) {
			Person p = new Person();
			JSONObject obj = array.getJSONObject(i);
			p.setId(obj.getInt("id"));
			p.setName(obj.getString("name"));
			p.setAge(obj.getInt("age"));
			people.add(p);
		}
		return people;
	}
	
	public static JSONArray peopleToJsonArray(Person[] people) {
		
		return peopleToJsonArray(Arrays.asList(people));

	}
}
