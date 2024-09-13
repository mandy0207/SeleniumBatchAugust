package uiComponents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@class='example']/a")).click();
		
		//grab all window handles opened in browser
		Set<String> windows = driver.getWindowHandles();
		
		//to iterate through window handles
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//switching to desired window handle
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
        
	}
	
	

}
