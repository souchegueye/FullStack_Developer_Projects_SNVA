package exercises_day1;

import java.util.Scanner;

public class TopicSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a topic:");
		System.out.println("1. JavaScript");
		System.out.println("2. Java");
		System.out.println("3. Relational Databases");

		int topic = scanner.nextInt();

		switch (topic) {
		case 1:
			System.out.println("JavaScript selected. Choose a subtopic:");
			System.out.println("1. JavaScript variables");
			System.out.println("2. Escape characters");
			System.out.println("3. Promises");

			int jsSubtopic = scanner.nextInt();

			switch (jsSubtopic) {
			case 1:
				System.out.println("JavaScript variables");
				// Code for JavaScript variables
				break;
			case 2:
				System.out.println("Escape characters");
				// Code for escape characters in JavaScript
				break;
			case 3:
				System.out.println("Promises");
				// Code for JavaScript promises
				break;
			default:
				System.out.println("Invalid subtopic choice for JavaScript");
				break;
			}
			break;

		case 2:
			System.out.println("Java selected. Choose a subtopic:");
			System.out.println("1. Java Core");
			System.out.println("2. Object-Oriented Programming");
			System.out.println("3. Threads");

			int javaSubtopic = scanner.nextInt();

			switch (javaSubtopic) {
			case 1:
				System.out.println("Java Core");
				// Code for Java core concepts
				break;
			case 2:
				System.out.println("Object-Oriented Programming");
				// Code for Java OOP concepts
				break;
			case 3:
				System.out.println("Threads");
				// Code for Java threads
				break;
			default:
				System.out.println("Invalid subtopic choice for Java");
				break;
			}
			break;

		case 3:
			System.out.println("Relational Databases selected. Choose a subtopic:");
			System.out.println("1. SQL");
			System.out.println("2. MySQL");

			int rdbmsSubtopic = scanner.nextInt();

			switch (rdbmsSubtopic) {
			case 1:
				System.out.println("SQL");
				// Code for SQL
				break;
			case 2:
				System.out.println("MySQL");
				// Code for MySQL
				break;
			default:
				System.out.println("Invalid subtopic choice for Relational Databases");
				break;
			}
			break;

		default:
			System.out.println("Invalid topic choice");
			break;
		}
	}
}
