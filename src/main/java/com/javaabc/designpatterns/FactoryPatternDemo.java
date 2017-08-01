package com.javaabc.designpatterns;

public class FactoryPatternDemo {
public static void main(String[] args) {
	ShapeFactory shapeFactory=new ShapeFactory();
	Shape shape1=shapeFactory.getShape("CIRCLE");
	shape1.draw();
	Shape shape2=shapeFactory.getShape("RECTANGLE");
	shape2.draw();
}
}
interface Shape{
	void draw();
}
class Rectangle implements Shape{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle::draw() method");	
	}
}
class Circle implements Shape{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle::draw() method");	
	}
}
class Square implements Shape{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square::draw() method");	
	}
}
class ShapeFactory{
	public Shape getShape(String shapeType) {
		if(shapeType==null) {
			return null;}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();}
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;

	}
}