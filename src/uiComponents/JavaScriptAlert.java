package uiComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		//will accept the alert present on UI
		alert.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
		
		//will cancel alert present on ui
		alert.dismiss();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
		
		//alert/prompt can also accept text
		alert.sendKeys("Hello !");
		alert.accept();
		
		driver.quit();
		
		
		

	}

}
