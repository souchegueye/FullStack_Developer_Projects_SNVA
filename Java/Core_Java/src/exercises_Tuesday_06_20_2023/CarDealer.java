package exercises_Tuesday_06_20_2023;

import java.time.LocalDate;
import java.time.YearMonth;

public class CarDealer {
	private static final String[] BMW_MODELS = { "X1", "X3", "X5" };
	private static final int[] CAR_COUNTS = new int[BMW_MODELS.length];
	private static int[] todayCounts = new int[BMW_MODELS.length];
	private static int totalSoldToday = 0;
	private static int totalSoldThisMonth = 0;

	public static void addCarSale(String model) {
		int modelIndex = getModelIndex(model);
		if (modelIndex != -1) {
			CAR_COUNTS[modelIndex]++;
			todayCounts[modelIndex]++;
			totalSoldToday++;
			totalSoldThisMonth++;
		}
	}

	public static int getModelIndex(String model) {
		for (int i = 0; i < BMW_MODELS.length; i++) {
			if (BMW_MODELS[i].equals(model)) {
				return i;
			}
		}
		return -1;
	}

	public static void displayTotalSold() {
		System.out.println("Total Cars Sold:");
		for (int i = 0; i < BMW_MODELS.length; i++) {
			System.out.println(BMW_MODELS[i] + ": Today " + todayCounts[i] + " sold, Month sold " + CAR_COUNTS[i]);
		}
		System.out.println("Total: " + totalSoldToday);
		System.out.println("Cars Sold Today: " + totalSoldToday);
		System.out.println("Cars Sold This Month: " + totalSoldThisMonth);
	}

	public static void main(String[] args) {
		addCarSale("X1");
		addCarSale("X3");
		addCarSale("X5");
		addCarSale("X1");
		addCarSale("X5");
		addCarSale("X3");

		displayTotalSold();
	}
}
