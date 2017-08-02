//package com.javaabc.designpatterns;
//
//public class BuilderPatternDemo {
//
//}
//interface Item{
//	public String name();
//	public Packing packing();
//	public float price();	
//}
//interface Packing{
//	public String pack();
//}
//class Wapper implements Packing{
//	public String pack() {
//		return "Wrapper";
//	}
//}
//class Bottle implements Packing{
//	public String pack() {
//		return "Bottle";
//	}
//}
//abstract class Burger implements Item{
//	public Packing packing() {
//		return new Wapper();
//	}
//	public abstract float price();
//}
//abstract class ColdDrink implements Item{
//	public Packing packing() {
//		return new Bottle();
//	}
//	public abstract float price();
//}
//class VegBurger extends Burger{
//
//}
//class ChickenBurger extends Burger{
//
//}
//class Coke extends ColdDrink{
//
//}
//class Pepsi extends ColdDrink{
//
//}
//class Meal{
//
//}