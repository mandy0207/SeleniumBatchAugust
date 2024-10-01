package javaBasic;

public class Car extends Vehicle{

	String brand;
	public Car(String brand, String type,  String price) {
		super(type, price);
		this.brand= brand;
		//System.out.println("i am in child constructor");
		
	}
	
	public void getBrand() {
		System.out.println(brand);
	}
	
	
}
