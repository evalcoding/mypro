package com.javaabc.designpatterns;

abstract class AbstractCustomer{
	protected String name;
	public abstract boolean isNil();
	public abstract String getName();
}
class RealCustomer extends AbstractCustomer{
	public RealCustomer(String name) {
		this.name=name;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public boolean isNil() {

		return Boolean.FALSE;
	}
}
class NullCustomer extends AbstractCustomer{
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}
	@Override
	public boolean isNil() {
		return Boolean.TRUE;
	}
}
class CustomerFactory{
	public static final String[] names= {"Rob","Joe","Julie"};
	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
public class NullObjectPatternDemo {
	public static void main(String[] args) {
		AbstractCustomer customer1=CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2=CustomerFactory.getCustomer("Bob");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}
}
