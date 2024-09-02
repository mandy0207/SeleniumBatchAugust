package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn_CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@id='gridCheck']"));
		
		//checks whether any checkbox/radio btn is checked or not
		boolean isChecked=checkbox.isSelected();
		System.out.println("Before checking : "+isChecked);
		
		checkbox.click();
		
		System.out.println("After checking: "+checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("After unchecking : "+checkbox.isSelected());
		
		
		//To check if an element is displayed on UI
		System.out.println("is checkbox displayed : "+checkbox.isDisplayed());
		
		//To check wheter checkbox is interactable or not
		System.out.println("is checkbox enabled: "+checkbox.isEnabled());
		
		
		driver.quit();

	}

}
