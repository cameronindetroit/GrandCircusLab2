package learningJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Program that takes two date inputs and compares the difference in days, months and years
 * Program currently only takes dates in correct format or it returns a compiler error
 */

public class DateCalculator {

	public static void main(String[] args) throws ParseException {
		Scanner scnr = new Scanner(System.in);

		// Program Variables
		String date1;
		String date2;
		Date formattedDate1;
		Date formattedDate2;

		// Command to receive number input for date 1
		System.out.println("Please enter date 1 Formatted: dd-MM-yyyy");
		date1 = scnr.nextLine();
		// System.out.println(date1);

		// Command to receive number input for date 2
		System.out.println("Please enter date 1 Formatted: dd-MM-yyyy");
		date2 = scnr.nextLine();
		// System.out.println(date2);

		// Format User input to date
		SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-yyy");
		formattedDate1 = dateForm.parse(date1);
		formattedDate2 = dateForm.parse(date2);

		// System.out.println(formattedDate1);
		// System.out.println(formattedDate2);

		/*
		 * Compare both dates, calculate the time difference in days, months and years
		 * Print output to consoleßßß
		 */

		if (date1.compareTo(date2) == 0) {
			System.out.println("Both date are equal");
		} else {
			long diffDays = (formattedDate1.getTime() - formattedDate2.getTime()) / 86400000; // 86400000 is the number
																								// // of
			System.out.println("The time difference in days is:  " + Math.abs(diffDays));

			long diffYears = diffDays / 365;
			System.out.println("The time difference in years is:  " + Math.abs(diffYears));

			long diffMonths = diffYears * 12;
			System.out.println("The time difference in months is:  " + Math.abs(diffMonths));
		}

	}
}
