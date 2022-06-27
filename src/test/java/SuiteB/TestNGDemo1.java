package SuiteB;
import org.testng.annotations.Test;

public class TestNGDemo1 {

	@Test
	public void Test1()
	{
		System.out.println("The thread ID for test1 Demo1 is "+ Thread.currentThread().getId());
		
	}
	@Test
	public void Test2()
	{
		System.out.println("The thread ID for test2 demo 1 is "+ Thread.currentThread().getId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am in test 2 of demo1.. I am slow");
	}
	
}
