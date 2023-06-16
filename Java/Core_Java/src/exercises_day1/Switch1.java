package exercises_day1;

import java.util.*;

public class Switch1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Month \n1.Jan\n2.Feb\n...\n12.Dec");
		int month = scanner.nextInt();

		String season;
		switch (month) {
		case 11:
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;

		default:
			season = "Invalid month";

		}
		System.out.println("Month " + month + " falls in " + season);
		

	}

}
