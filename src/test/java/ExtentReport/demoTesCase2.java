package ExtentReport;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utilities.ExtentManager;

public class demoTesCase2 {
	
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void init()
	{
		report = ExtentManager.getReport();
	}
	
	@Test
	public void login()
	{					
					test = report.createTest("LoginTest");
					test.log(Status.INFO, "My first extent test case");
					test.log(Status.INFO, "Opening Chrome browser");
					test.log(Status.INFO, "Testing log");
					
					test.log(Status.PASS, "Test case is passed");
					
					test.addScreenCaptureFromPath("C:\\Users\\hsingh\\Desktop\\Capture.png","Error message 404");

					Assert.fail();			

	}
	
	@Test
	public void bmoLogin()
	{
		test = report.createTest("Verify BMO page");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsingh\\Downloads\\selenium-java-4.2.1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bmo.com/main/personal/credit-cards/bmo-rewards-mastercard/");
		test.log(Status.PASS, "Able to open web link");

	}
	@Test
	public void fftest()
	{
		test = report.createTest("Firefix test");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hsingh\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
				
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		report.flush();
	}

}
