package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("new");
		
		List<WebElement> states = driver.findElements(By.xpath("//*[contains(@class,'-results__option')]/li"));
		

		
		
		for(WebElement state : states) {
			if(state.getText().equalsIgnoreCase("new york")) {
				state.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//for second selection
		driver.findElement(By.xpath("//*[@aria-label='Search']")).sendKeys("ca");
		//follow same steps
		
		driver.quit();
		
		

	}

}
