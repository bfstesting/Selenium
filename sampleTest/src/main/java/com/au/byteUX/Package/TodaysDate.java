/**
 * 
 */
package com.au.byteUX.Package;

import java.text.*;
import java.util.Date;

/**
 * @author sarkah01
 *
 */
public class TodaysDate {
	
	public static String main() {
		 
		 // Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String TodaysDate= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(TodaysDate);
		 
		 return TodaysDate;
		 
		 }

}
