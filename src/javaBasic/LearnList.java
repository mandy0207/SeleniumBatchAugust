package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class LearnList {

	
	@Test
	public void learnList1() {
		List<String> list1 = new ArrayList<>();
		list1.add("Sneha");
		list1.add("Aneesa");
		System.out.println(list1);
		
		List<Car> carList = new ArrayList<>();
		carList.add( new Car("BMW", "hatchback", "12300"));
		carList.add( new Car("Audi", "Sedan", "18900"));
		System.out.println(carList.size());
		
carList.forEach(car->{
	car.getBrand();
});
	}
}
