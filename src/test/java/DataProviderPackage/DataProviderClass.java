package DataProviderPackage;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider
	//Object is the return type of this method, DPMethod is returning the object
	public Object[][] DPMethod(Method m) 
	{
		Object[][] mydata = null;
//		
//		if(m.getName() == "useDataProvider")
//		{
//		mydata = new Object[3][4];
//		
//		mydata[0][0] = "Harman";
//		mydata[0][1] = "Toronto";
//		mydata[0][2] = "Canada";
//		mydata[0][3] = 1500;
//		
//
//		mydata[1][0] = "Haris";
//		mydata[1][1] = "Missisuaga";
//		mydata[1][2] = "Canada";
//		mydata[1][3] = 2000;
//		
//
//		mydata[2][0] = "SatyaPriya";
//		mydata[2][1] = "Delhi";
//		mydata[2][2] = "India";
//		mydata[2][3] = 3000;
//		}
//		
////	}
////	@DataProvider
////	public Object[][] InstDPMethod(Method instructor)
////	{
//		if(m.getName() == "InstDataProvider")
//		{
//		mydata = new Object[2][3];
//		
//		mydata[0][0] = "Mitesh";
//		mydata[0][1] = "m@abc.com";
//		mydata[0][2] = 10000;
//		
//		mydata[1][0] = "Dilip";
//		mydata[1][1] = "d@abc.com";
//		mydata[1][2] = 15000;
//		}
//		
//		
//		return mydata;
//	
//	
	
		
			if(m.getName()=="useDataProvider")
			{
	    // provide data
		mydata = new Object[3][4];
		
		mydata[0][0] = "Harman";
		mydata[0][1] = "Toronto";
		mydata[0][2] = "Canada";
		mydata[0][3] = 1500;
		

		mydata[1][0] = "Haris";
		mydata[1][1] = "Missisuaga";
		mydata[1][2] = "Canada";
		mydata[1][3] = 2000;
		

		mydata[2][0] = "SatyaPriya";
		mydata[2][1] = "Delhi";
		mydata[2][2] = "India";
		mydata[2][3] = 3000;
			}
	  
		
		//case "InstDataProvider" :
			if(m.getName()=="InstDataProvider")
			{
		  mydata = new Object[2][3];
			
		  mydata[0][0] = "Mitesh";
		  mydata[0][1] = "m@abc.com";
		  mydata[0][2] = 10000;
			
		  mydata[1][0] = "Dilip";
		  mydata[1][1] = "d@abc.com";
		  mydata[1][2] = 15000;
			}
	    // code block
		  
	
		return mydata;


}
}
