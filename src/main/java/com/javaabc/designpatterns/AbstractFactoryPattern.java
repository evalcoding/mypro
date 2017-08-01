package com.javaabc.designpatterns;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		Shape shape1=shapeFactory.getshape("CIRCLE");
		shape1.draw();
		AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");
		Color color1=colorFactory.getColor("RED");
		color1.fill();
	}
}

//interface Shape1{
//	void draw();
//}
//class Rectangle1 implements Shape{
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		System.out.println("Rectangle::draw() method");
//	}
//}
//class Circle1 implements Shape{
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		System.out.println("Circle::draw() method");
//	}
//}
//class Square1 implements Shape{
//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		System.out.println("Square::draw() method");
//	}
//
//}
interface Color{
	void fill();
}
class Red implements Color{
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("fill red");
	}
}
class Blue implements Color{
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("fill blue");
	}
}
class Green implements Color{
	public void fill() {
		// TODO Auto-generated method stub
		System.out.println("fill green");
	}
}
abstract class AbstractFactory{
	abstract Color getColor(String color);
	abstract Shape getshape(String shape);
}
class ShapeFactory1 extends AbstractFactory{
	@Override
	Color getColor(String color) {
		return null;
	}
	@Override
	Shape getshape(String shape) {
		if(shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		if(shape.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		if(shape.equalsIgnoreCase("SQUARE"))
			return new Rectangle();
		return null;
	}
}
class ColorFactory extends AbstractFactory{
	@Override
	Color getColor(String color) {
		if(color.equalsIgnoreCase("RED"))
			return new Red();
		if(color.equalsIgnoreCase("GREEN"))
			return new Green();
		if(color.equalsIgnoreCase("BLUE"))
			return new Blue();
		return null;
	}
	@Override
	Shape getshape(String shape) {
		return null;
	}
}
class FactoryProducer{
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE"))
			return new ShapeFactory1();
		if(choice.equalsIgnoreCase("COLOR"))
			return new ColorFactory();
		return null;
	}
}