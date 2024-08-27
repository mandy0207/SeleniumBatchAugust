package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

		// ctrl+shift+o
		WebDriver driver = new ChromeDriver();
        
		//To maximize window
		driver.manage().window().maximize();
		
		//To open browser
		driver.get("https://www.google.com");

		//To Grab Title of page
		String title = driver.getTitle();
		System.out.println(title);
		
		//grab current url that is opened
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		//is used to close current window of browser
		//driver.close();
		
		//close entire browser
		driver.quit();
	}

}
