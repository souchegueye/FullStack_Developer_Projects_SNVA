package exercises_Tuesday_06_20_2023;

public class TestCar {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari("Red", 320, "Ferrari 458 Italia", "Carbon fiber body, upgraded engine");
		ferrari.features();
		ferrari.features(2023);
		ferrari.features(2023, 250000.0);
	}
}