package exercises_day1;

public class TestWithFor2 {

	public static void main(String[] args) {
		for (int ctr = 1; ctr <= 10; ctr++) {
			for (int ptr = 1; ptr <= ctr; ptr++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}
