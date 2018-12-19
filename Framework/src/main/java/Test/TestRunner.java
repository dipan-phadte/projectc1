package Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import Implementaion.LogInPageImplementation;
import basic.ExtReport;
//
public class TestRunner {
	@AfterTest
	public void afterTest()
	{
		//calling function from Extent report class
		ExtReport.closeReport();
	}
	
	@Test
	public void testRun()
	{
		LogInPageImplementation login=new LogInPageImplementation();
		login.pageImpl( "1","LogInPage");
	}


}
