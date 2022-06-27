package ExtentReport;

import java.io.File;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utilities.ExtentManager;

public class demoTesCase {
	
ExtentReports report;
	
	@BeforeMethod
	public void init()
	{
		report = ExtentManager.getReport();
	}
	
	@Test
	public void register()
	{
	

					
//					ExtentTest test = report.createTest("LoginTest");
	
					String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
					ExtentTest test =report.createTest(methodName);

					
					test.log(Status.INFO, "My first extent test case");
					test.log(Status.INFO, "Opening Chrome browser");
					test.log(Status.INFO, "Testing log");
					
					test.log(Status.FAIL, "Test case is failed");
					
					test.addScreenCaptureFromPath("C:\\Users\\hsingh\\Desktop\\Capture.png","Error message 404");

					Assert.fail();
				

	}
	
	
	@AfterMethod
	public void teardown()
	{
		report.flush();
	}

}
