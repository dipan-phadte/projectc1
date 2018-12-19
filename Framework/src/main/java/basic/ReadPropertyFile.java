package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
//this class is to read the data from config.properties txt
public class ReadPropertyFile {
	public static String getProperty(String path)
	{
		Properties prop = new Properties();
		InputStream input = null;
		String filePath=null;

		try {

			input = new FileInputStream("../Framework/Config.properties");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			filePath=prop.getProperty(path);
			
return filePath;
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
