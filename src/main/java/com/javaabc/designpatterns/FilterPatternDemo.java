package com.javaabc.designpatterns;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	private String gender;
	private String matritalStatus;
	public Person(String name,String gender,String maritalStatus) {
		this.name=name;
		this.gender=gender;
		this.matritalStatus=maritalStatus;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getMatritalStatus() {
		return matritalStatus;
	}
}
interface Criteria{
	public List<Person> meetCriteria(List<Person> persons);
}
class CriteriaMale implements Criteria{
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons=new ArrayList<Person>();
		for(Person person:persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
public class FilterPatternDemo {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("1", "MALE", "Single"));
		persons.add(new Person("2", "FEMALE", "Married"));
		Criteria male=new CriteriaMale();
		printPersons(male.meetCriteria(persons));
	}
	private static void printPersons(List<Person>persons) {
		for (Person person : persons) {
			System.out.println("Person:[Name:"+person.getName()
			+" Gender:"+person.getGender()
			+" MatritalStatus:"+person.getMatritalStatus()+"]");
		}
	}
}
