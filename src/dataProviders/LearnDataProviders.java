package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {

	
	@Test(dataProvider="getData")
	public void mytest(String userName, String password) {
		System.out.println(userName + " "+password);
		
	}
	
	
	@DataProvider
	public String[][] getData() {
		String creds[][]= new String[2][2];
		
		//Ist row
		creds[0][0]="snehaJoseph24";
		creds[0][1]="qwerty123";
		
		//2nd row
		creds[1][0]="Aneesa12";
		creds[1][1]="Kerela@";
		
		return creds;
		
	}
	
	
	
}
