package basic;

import org.openqa.selenium.By;

//import com.relevantcodes.extentreports.LogStatus;
//this class will have all the functions
public abstract class GenricFunctions extends Configuration {

	public abstract void pageImpl(String testCaseName,String sheetName);
	public void set(String ele,String data)
	{
		driver.findElement(By.xpath(ele)).sendKeys(data);
		//logger.log(LogStatus.PASS, "Setting value"+data);
	}
	public void click(String ele)
	{
		driver.findElement(By.xpath(ele)).click();
	}
	/*public void selectByValue(String ele,String data)
	 * {
	 * Select sel=new Select(driver.findElement(By.xpath(ele)));
	 * sel.selectByValue(data);
	 * 
	 */
	
	
	
}

