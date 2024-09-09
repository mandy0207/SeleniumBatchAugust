package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//scrolling vertically
		//js.executeScript("window.scrollBy(0,2000);");
		
		WebElement desiredElement = driver.findElement(By.xpath(" //*[contains(text(),'Recent placements')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		driver.quit();
		

	}

}
