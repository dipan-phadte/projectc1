package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;
//this class 

public class Configuration {
	public WebDriver driver=null;
	public ExtentTest logger=null;
	public Configuration()
	{System.setProperty("webdriver.chrome.driver", ReadPropertyFile.getProperty("ChromeDriverPath"));
		 driver=new ChromeDriver();
		 logger=ExtReport.startRport();
		driver.get(ReadPropertyFile.getProperty("ApplicationURL"));


}
}

