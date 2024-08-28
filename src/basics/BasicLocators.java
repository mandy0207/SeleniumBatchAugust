package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		/**
		 * 1. ID - 
		 * 2. name
		 * 3. classname
		 * 4. LinkText
		 * 5. partialLink text
		 * 
		 */
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("About")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.quit();
		
	}

}
