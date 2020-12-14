package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	static Properties properties;
	
	public static void readProperties(String fName) throws FileNotFoundException,IOException{
		
		properties = new Properties();
		File f;
		
		f = new File(System.getProperty("user.dir")+"\\Config\\"+fName+".properties");
		

			FileReader reader = new FileReader(f);
			
			properties.load(reader);	
			
	}
	
	public static String getObject(String fName, String data) throws FileNotFoundException, IOException {	
		readProperties(fName);
		return properties.getProperty(data);
	}

}
