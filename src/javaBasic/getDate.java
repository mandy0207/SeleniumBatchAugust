package javaBasic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate {

	public static void main(String[] args) {
		
		String weird = " hjvjv :   / :   :: :  12334";
	
		System.out.println(weird);
		//System.out.println(weird.replaceAll(":", "").replaceAll("/", "").trim());
		
		System.out.println(weird.replaceAll("[^a-z]", ""));

	}

}
