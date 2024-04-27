package testCases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TodayDate {

	public static String getFormattedDate() {
		
		LocalDate today = LocalDate.now();

	      // Format the date as mm/dd/yyyy
	      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	     
	      String formattedDate1 = today.format(formatter);
		
	      return formattedDate1;
	}
	
}
