package Implementaion;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import Package1.Framework.ReadData_advanced;
import basic.GenricFunctions;
//
public class LogInPageImplementation extends GenricFunctions{
	
	
	
	@Override
	public void pageImpl(String testCaseName,String sheetName) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,String> elements=new HashMap<String,String>();
		Map<String,String> data=new HashMap<String,String>();
		elements=ReadData_advanced.getPageElements(sheetName);
		data=ReadData_advanced.getTestData(testCaseName,sheetName );
			set(elements.get("FirstName"),data.get("FirstName"));
			set(elements.get("LastName"),data.get("LastName"));
			/*set(elements.get("EmailAddress"),data.get("EmailAddress"));
			set(elements.get("NewPassword"),data.get("NewPassword"));
			set(elements.get("BirthDay"),data.get("BirthDay"));
			set(elements.get("BirthMonth"),data.get("BirthMonth"));
			set(elements.get("BirthYear"),data.get("BirthYear"));
			*/
			
			
	}



}
