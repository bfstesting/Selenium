package lib;

import java.util.Random;

public class UtilMethods {
	
	public static String generateHiveBrand() {
		
		Random rand = new Random();
		
		int upperbound = 999999;
        //generate random values from 0-24
		int int_random = rand.nextInt(upperbound); 
		
		String hbNumber = "HB"+int_random;
		
		System.out.println("HB Number: "+hbNumber);
      
		return hbNumber;
	}

}
