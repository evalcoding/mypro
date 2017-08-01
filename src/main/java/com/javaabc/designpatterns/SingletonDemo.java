package com.javaabc.designpatterns;

public class SingletonDemo {
public static void main(String[] args) {
	SingleObject object=SingleObject.getInstance();
	object.showMessage();
}
}
class SingleObject{
	private static SingleObject instance=new SingleObject();
	private SingleObject() {
	}
	//饿汉式
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("hello world");
	}
}
//懒汉式 线程不安全
class Singleton{
	private static Singleton instance;
	private Singleton() {}
	//懒汉式 线程不安全
	/*public static Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
		}
		return instance;
	}*/
	//懒汉式 线程安全
	/*public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance= new Singleton();
		}
		return instance;
	}*/
	
}
