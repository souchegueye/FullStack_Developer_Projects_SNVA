package exercises_day1;

import java.util.*;

public class Switch2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the character: ");
		String ch = scanner.nextLine();

		String letter;
		switch (ch) {
		case "A":
			letter = "vowel";
		case "Z":
			letter = "consonant";
			break;

		default:
			letter = " Invalid character";

		}
		System.out.println(ch + " is a " + letter);
		// System.out.println(letter);

	}

}
