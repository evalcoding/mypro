package com.javaabc.json;

import org.json.JSONObject;

public class test {
	public static void main(String[] args) {
		Person person=new Person();
		person.setAge(11);
		person.setName("≤‚ ‘");
		JSONObject jsonObject = new JSONObject(person);
		System.out.println(jsonObject.toString());
	}
}
