package TestSuiteA;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeProfilingAndOptions {
	
	@BeforeTest
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hsingh\\Downloads\\selenium-java-4.2.1\\Driver\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "test-output\\chrome.log");
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		ChromeOptions ops = new ChromeOptions();
		//ops.setBinary("");
		//ops.setPageLoadStrategy(strategy)
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		//  do not run this : ops.addArguments("--proxy-server=http://89.2872.292.2:9090");
		
		//ops.addArguments("user-data-dir=C:\\Users\\nayan\\AppData\\Local\\Google\\Chrome\\User Data\\Profile6");
		ChromeDriver cd = new ChromeDriver(ops);
		cd.get("https://www.facebook.com/");
		// 100 lines
		//cd.findElement(By.xpath(xpathExpression))
		
	}
	
	@Test
	public void fblogin()
	{
		
	}
	
	//@Test
	public void edgetest()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hsingh\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "test-output\\edge.log");
		
		EdgeOptions ep = new EdgeOptions();
		ep.addArguments("--disable-notifications");
		ep.addArguments("--start-maximized");
		ep.addArguments("ignore-certificate-errors");
		
		
		EdgeDriver ed = new EdgeDriver(ep);
		ed.get("https://untrusted-root.badssl.com/");
	}

}
