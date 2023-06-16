package exercises_day1;

public class While1 {

	public static void main(String[] args) {
		System.out.println("Even numbers between 100 and 120 (inclusive):");

		int number = 100;

		while (number <= 120) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}
	}
}
