package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**
		 * Syntax of xpath
		 * 1. //tagname[@attribute='value'] or  //*[@attribute='value']
		 * 2. //parent//child
		 * 3. //parent[index]/child[index]
		 * 4. //tagname[contains(text(),'some substring of text')]
		 * 5. //tagname[contains(@attribute,'some substring of text')]
		 */

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("mypassword");
		
		driver.findElement(By.xpath("//*[@class='buttons']/*[@value='Log in']")).click();
		//driver.findElement(By.xpath("//*[@class='button- login-button']")).click();
		
		driver.findElement(By.xpath("(//*[@class='list'])[1]/li[4]/a")).click();
		driver.findElement(By.xpath("//h2[@class='product-title']//*[contains(text(),'Blue Jeans')]")).click();
		
		WebElement qty = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]"));
		qty.clear();
		qty.sendKeys("4");
		
		driver.quit();
		
		
		
	}

}
