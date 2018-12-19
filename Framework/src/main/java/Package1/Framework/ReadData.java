package Package1.Framework;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
//data package
public class ReadData {

	public Recordset getExcelData() {
		// TODO Auto-generated method stub
		Fillo fillo=new Fillo();
		Connection connection;
		try
		{
			connection=fillo.getConnection("C:\\Users\\hp\\Desktop\\DataRead.xlsx");
			String strQuery="Select*from Sheet1 where TestCaseID='1'";
			Recordset recordset= connection.executeQuery(strQuery);
			while(recordset.next())
			{
				/**System.out.println(recordset.getField("Name"));
				System.out.println(recordset.getField("ID"));**/
				
			}
			
			recordset.close();
			
			connection.close();
			return recordset;
		}	
		catch(FilloException e)
		{
			e.printStackTrace();
			return null;
			
		}
		
		
	}
}
