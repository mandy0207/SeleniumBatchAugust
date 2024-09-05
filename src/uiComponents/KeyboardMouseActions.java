package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		Actions act = new Actions(driver);
		
		WebElement others=driver.findElement(By.xpath("//*[@id='others']"));
		//hover over an element
		act.moveToElement(others).perform();
		
		WebElement input = driver.findElement(By.xpath("//*[@id='single-input-field']"));
		
		act.moveToElement(input).click().sendKeys("mandy").perform();
		
		input.clear();
		
		//we can also press keyboard key and send text
		act.moveToElement(input).click().keyDown(Keys.SHIFT).sendKeys("sneha").perform();
		
		WebElement messageBtn = driver.findElement(By.id("button-one"));
		
		//to double click on any webelement
		act.moveToElement(messageBtn).doubleClick().perform();
		
		//right click on element
		act.moveToElement(messageBtn).contextClick().perform();
		
		driver.quit();

		
	}

}
