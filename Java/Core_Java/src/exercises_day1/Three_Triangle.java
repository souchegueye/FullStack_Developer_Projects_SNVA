package exercises_day1;

import java.util.*;

public class Three_Triangle {

	public static void main(String[] args) {

		double side1, side2, side3;
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter a length of a side:");
		side1 = in.nextDouble();
		System.out.println("Please enter a length of a side:");
		side2 = in.nextDouble();
		System.out.println("Please enter a length of a side:");
		side3 = in.nextDouble();

		if (side1 == side2 && side2 == side3) {
			System.out.println("This Triangle is equilateral");
		} else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("This Triangle is isocele");
		} else {
			System.out.println("This Triangle is scalene");
		}

	}
}