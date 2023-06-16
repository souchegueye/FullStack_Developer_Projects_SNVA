package exercises_day2;

/*Author Mohamed Gueye*/

public class Function1 {

	// Declare my variables here
	private int num1;
	private int num2;
	private int num3;

	// initialize the variables in the constructor
	public Function1() {

		num1 = 5;
		num2 = 10;
		num3 = 15;
	}

	//calculate the sum here
	public void getSum() {
		int sum = num1 + num2 + num3;
		System.out.println("Sum: " + sum);
	}

	//calculate the product
	public int getProduct() {
		int product = num1 * num2 * num3;
		return product;
	}

}
