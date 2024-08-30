package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yatra.com/");
		
		//to grab text of any webelement
		WebElement heading =driver.findElement(By.xpath("//h1[@class='main-heading']"));
		String text=heading.getText();
		
		System.out.println(text);
		
		//to grab attribute value
		String titleAttr=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[2]/a")).getAttribute("title");
		
		System.out.println(titleAttr);
		
		//toolTip is nothing but value of title attribute
		String toolTip=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[3]/a")).getAttribute("title");
	
		System.out.println(toolTip);
		
		String cssValue=heading.getCssValue("display");
		
		System.out.println(cssValue);
		
		driver.quit();
		

	}

}
