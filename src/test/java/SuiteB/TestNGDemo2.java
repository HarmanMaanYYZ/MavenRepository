package SuiteB;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test
	public void Test1()
	{
		System.out.println("The thread ID for Test1 in Demo2 is "+ Thread.currentThread().getId());
		
	}
	@Test
	public void Test2() throws InterruptedException
	{
		System.out.println("The thread ID for test2 in Demo2 is "+ Thread.currentThread().getId());
		Thread.sleep(4000);
		System.out.println("I am in Test 2 of demo 2.. I am slow");
	
	}
	
}
