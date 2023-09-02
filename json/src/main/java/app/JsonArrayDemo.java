package app;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import app.dtos.Person;
import app.utilities.JsonArrayCorverter;

public class JsonArrayDemo {
	public static void main(String ... args) {
		List<Person> people = new ArrayList<>();
		
		Person p1 = new Person(1, "Jhon", 12);
		Person p2 = new Person(2, "Jhon", 13);
		Person p3 = new Person(3, "Jhon", 14);
		Person p4 = new Person(4, "Jhon", 15);
		Person p5 = new Person(5, "Jhon", 16);
		Person p6 = new Person(6, "Jhon", 17);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		JSONArray array = JsonArrayCorverter.peopleToJsonArray(people);
		
		System.out.println(array);
		
		JSONObject obj = new JSONObject();
		obj.put("people", array);
		System.out.println(obj.toString());
		
		List<Person> ppl = JsonArrayCorverter.jsonArrayToPeople(array);
		
		System.out.println(ppl);
		
		
	}
}
