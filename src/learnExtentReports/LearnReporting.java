package learnExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnReporting {

	ExtentReports extent;
	@BeforeTest
	public void generateReport() {
		String reportPath= System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Obsqura Automation");
		reporter.config().setDocumentTitle("Obsqura Zone");
		
		 extent =new  ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA", "Adithya");
		extent.setSystemInfo("Environment", "STAGING");
	}
	
	@Test
	public void mytest() {
		 ExtentTest test = extent.createTest("mytest");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.quit();
		test.log(Status.PASS, "Hello My test passed");
		extent.flush();
	}
	
	@Test
	public void mytest2() {
		 ExtentTest test = extent.createTest("mytest2");
		 test.log(Status.FAIL, "Intentionally failing this test");
		System.out.println("hello");
		extent.flush();
		Assert.fail();
	}
}
