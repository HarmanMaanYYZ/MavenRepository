package Utilities;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	static ExtentReports report;
	
	public static ExtentReports getReport()
	{
		if(report == null)
		{
		Date date = new Date() ;
		String udate= date.toString().replaceAll(":", ".").replaceAll(" ", "_");
		System.out.println(udate);
		String reportFolder= System.getProperty("user.dir")+"\\testReport\\"+udate;
		System.out.println(reportFolder);
		String screenshotPath= reportFolder+"\\screenshots";
		System.out.println(screenshotPath);
		File file = new File(screenshotPath);
		file.mkdirs();
		
		
		report = new ExtentReports();
		ExtentSparkReporter sparkrep = new ExtentSparkReporter(reportFolder);
		
		// Finalizing report configurations by specifing report name, theme and encoding
					sparkrep.config().setReportName("My First Extent Report");
					sparkrep.config().setDocumentTitle("Automation Testing");
					sparkrep.config().setTheme(Theme.STANDARD);
					sparkrep.config().setEncoding("utf-8");
					
					// integrate report with sparkReporter
					report.attachReporter(sparkrep);
		}
		return report;
		
	}

}
