package exercises_day2;

public class Equation {

	int x;
	int y;

	public Equation() {
		x = 3;
		y = 6;
	}

	public void computeEquation() {
		int z = (x + y) / 2;
		System.out.println("The result is: " + z);
	}

}
