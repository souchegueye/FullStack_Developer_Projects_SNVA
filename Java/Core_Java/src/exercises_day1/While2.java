package exercises_day1;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int The_small_number = Math.min(num1, num2);
		int The_larger_umber = Math.max(num1, num2);

		int midpoint = The_small_number + (The_larger_umber - The_small_number) / 2;

		System.out.println("The midpoint is: " + midpoint);
	}
}
