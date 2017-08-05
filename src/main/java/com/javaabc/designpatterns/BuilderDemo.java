package com.javaabc.designpatterns;

import java.rmi.StubNotFoundException;

import javax.management.openmbean.OpenMBeanConstructorInfo;

class Student{
	private Student() {}
	private Student(Student origin){
		this.id=origin.id;
		this.name=origin.name;
		this.passwd=origin.passwd;
		this.sex=origin.sex;
		this.address=origin.address;
	}
	private int id;
	private String name;
	private String passwd;
	private String sex;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
static class Builder{
	private Student target;
	public Builder() {
		target=new Student();
	}
	
}
public class BuilderDemo {

}
