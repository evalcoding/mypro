package com.javaabc.designpatterns;

class ShapMaker{
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	public ShapMaker() {
		circle=new Circle();
		rectangle=new Rectangle();
		square=new Square();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapMaker shapMaker=new ShapMaker();
		shapMaker.drawCircle();
	}
}
