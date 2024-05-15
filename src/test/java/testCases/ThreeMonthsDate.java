package testCases;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreeMonthsDate {

	 public static String getFormattedDateAfter3Months() {
	        // Get today's date
	        LocalDate today = LocalDate.now();

	        // Add three months to today's date
	        LocalDate dateAfter3Months = today.plusDays(90);

	        // Format the date as mm/dd/yyyy
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String formattedDateAfter3Months = dateAfter3Months.format(formatter);

	        return formattedDateAfter3Months;
	    }
	 
	 public static void main(String[] args) {
		    System.out.println("Today's date: " + TodayDate.getFormattedDate());
		    System.out.println("Date after 3 months: " + ThreeMonthsDate.getFormattedDateAfter3Months());
		}
}
