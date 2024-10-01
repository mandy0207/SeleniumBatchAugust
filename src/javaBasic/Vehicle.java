package javaBasic;

public class Vehicle {

	String type, price;
	
	public  Vehicle(String type, String price) {
		//System.out.println("I am in parent constructor");
		this.type= type;
		this.price= price;
	}
	
	public void getType() {
		System.out.println(type);
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", price=" + price + "]";
	}
	
	
}
