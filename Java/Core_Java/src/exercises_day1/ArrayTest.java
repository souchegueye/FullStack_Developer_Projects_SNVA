package exercises_day1;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your month (1-12): ");
		int monthNumber = scanner.nextInt();

		if (monthNumber >= 1 && monthNumber <= 12) {
			String userMonth = months[monthNumber - 1];
			System.out.println("Your month of birth is: " + userMonth);
		} else {
			System.out.println("Invalid month number.");
		}
	}
}
