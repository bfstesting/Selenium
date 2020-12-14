package lib;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	static Properties properties;
	
	public static void readPropertiesFile(String fName) throws FileNotFoundException,IOException{
		
		properties = new Properties();

			File f = new File(System.getProperty("user.dir")+"\\Config\\"+fName+".properties");
			
			FileReader reader = new FileReader(f);
			
			properties.load(reader);	
			
	}
	
	public static String getObject(String data) throws FileNotFoundException, IOException {	
		String fileName = null;
		readPropertiesFile(fileName);
		return properties.getProperty(data);
	}
	
	

}
