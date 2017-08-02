package com.javaabc.designpatterns;

import java.util.Hashtable;

abstract class ShapePrototype implements Cloneable{
	private String id;
	protected String type;
	abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object clone() {
		Object clone=null;
		try {
			clone =super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
}
class SquarePrototype extends ShapePrototype{
	public SquarePrototype() {
		type="Square";
	}
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");	
	}
}
class CirclePrototype extends ShapePrototype{
	public CirclePrototype() {
		type="Circle";
	}
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method.");		
	}
}
class RectanglePrototype extends ShapePrototype{
	public RectanglePrototype() {
		type="RectanglePrototype";
	}
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
class ShapeCache{
	private static Hashtable<String, ShapePrototype> shapeMap=new Hashtable<String, ShapePrototype>();
	public static ShapePrototype getShapePrototype(String shapeProtoTypeId) {
		ShapePrototype cacheShape=shapeMap.get(shapeProtoTypeId);
		return (ShapePrototype)cacheShape.clone();
	}
	public static void loadCache(){
		CirclePrototype circlePrototype=new CirclePrototype();
		circlePrototype.setId("1");
		shapeMap.put(circlePrototype.getId(), circlePrototype);
		SquarePrototype squarePrototype=new SquarePrototype();
		squarePrototype.setId("1");
		shapeMap.put(squarePrototype.getId(), squarePrototype);
		RectanglePrototype rectanglePrototype =new RectanglePrototype();
		rectanglePrototype.setId("1");
		shapeMap.put(rectanglePrototype.getId(), rectanglePrototype);
	}
}
public class PrototypePatternDemo {
public static void main(String[] args) {
	ShapeCache.loadCache();
	ShapePrototype cloneShape=(ShapePrototype)ShapeCache.getShapePrototype("1");
	System.out.println("Shape:"+cloneShape.getType());
}
}