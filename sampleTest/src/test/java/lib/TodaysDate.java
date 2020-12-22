/**
 * 
 */
package lib;

import java.text.*;
import java.util.Date;

/**
 * @author sarkah01
 *
 */
public class TodaysDate {
	
	public static String getTodaysDate() {
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String todaysDate= dateFormat.format(date);
		 
		 // Print the Date
		 //System.out.println(todaysDate);
		 
		 return todaysDate;
		 
		 }

}
