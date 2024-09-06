package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		/**
		 * In order to handle elements inside iframe, we need to switch into iframe first
		 * 
		 * 2. By webelement
		 */
		/**
		 * switching through id or name
		 */
		driver.switchTo().frame("singleframe");
		/**
		 * switching through webelement
		 */
//		WebElement frameWebElement = driver.findElement(By.xpath("//*[@name='SingleFrame']"));
//		driver.switchTo().frame(frameWebElement);
		
		/**
		 * switch through index
		 */
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@class='row']//input")).sendKeys("Revathi");
		
		//it will shift out of frame
		driver.switchTo().defaultContent();
				
		String heading =driver.findElement(By.xpath("//h1")).getText();
		
		
		System.out.println(heading);
		
		driver.quit();

	}

}
