package SuiteA;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProvider {
	
	@Test(dataProviderClass = DataProviderPackage.DataProviderClass.class, dataProvider = "DPMethod")
	public void useDataProvider(String name, String city, String country, int fee)
	{
		System.out.println("Names of candidates are: " + name);
		System.out.println("Cities to which candidates belong: " + city);
		System.out.println("Countries to which candidates belong: " + country);
		System.out.println("Fee paid by candidates: " + fee + "\n");
		Assert.fail("Testcase is failing here");
		
	}
	
	@Test(dataProviderClass = DataProviderPackage.DataProviderClass.class, dataProvider = "DPMethod", priority = 1)
	public void InstDataProvider(String name, String email, int salary)
	{
		System.out.println("Names of instructors are: " + name);
		System.out.println("Emails of instructors are: " + email);
		System.out.println("Salary paid to instructors is: " + salary + "\n");
		
	}
	
	
	
	

}
