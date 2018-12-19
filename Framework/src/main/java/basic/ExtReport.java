package basic;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtReport {
	
	static ExtentReports extent;
	static ExtentTest Logger;
	
	public static ExtentTest startRport()
	{
		extent= new ExtentReports("‪C:\\Users\\hp\\eclipse-workspace\\Framework\\test-output\\ExtentReport\\Report.html",true);
		extent.loadConfig(new File("/Framework/config.xml"));
		Logger=extent.startTest("passTest");
		
		return Logger;
	}
	public static void closeReport()
	{
		extent.endTest(Logger);
		extent.flush();
		extent.close();
		
		
	}
	
	
	
	

}
