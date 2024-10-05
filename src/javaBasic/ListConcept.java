package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListConcept {

	@Test
	public void test() {

		List<String>  productNamesList = new ArrayList<>(Arrays.asList(
		    "Black & White Gold Heart",
		    "Diamond Pave Earrings",
		    "Diamond Tennis Bracelet",
		    "Vintage Style Three Stone Diamond Engagement Ring"
		));

		System.out.println(productNamesList);
		
		
		boolean istextMatched= true;
		for(String productName : productNamesList) {
			if(!productName.contains("Gold")) {
				System.out.println(productName);
				istextMatched=false;
			    break;
			}
		}
		
		Assert.assertTrue(istextMatched, "Product is not matching");
	}
}
