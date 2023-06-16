package exercises_day1;

import java.util.*;

public class TestWithFor {
	;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter yes or no");

		String input = scanner.nextLine();

		if (input.equals("yes")) {
			System.out.println("Java is easy to learn");

			System.out.println("How many times do you want to repeat the loop?");
			int repeatCount = scanner.nextInt();

			for (int i = 1; i <= repeatCount; i++) {
				System.out.println("This is the  " + i + " iteration. ");
			}
		} else if (input.equals("no")) {
			System.out.println("Stop the loop");
		} else {
			System.out.println("Invalid input");
		}
	}
}
