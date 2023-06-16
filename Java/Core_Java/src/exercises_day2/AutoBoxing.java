package exercises_day2;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long long1 = 87987;
		double double1 = 9898.987;

		// AutoBoxing
		Long longwrap = long1;
		Double doublewrap = double1;
		System.out.println(longwrap + " " + doublewrap);

		// Auto UnBoxing
		long long2 = longwrap;
		double double2 = doublewrap;
		System.out.println(long2 + " " + double2);

		// AutoBoxing
		int autoboxing = 24;
		float autoboxing1 = 22;
		boolean autoboxing2 = true;
		int unboxing = 44;
		float unboxing1 = 37;
		boolean unboxing2 = false;

		System.out.println("Int autoboxing:" + autoboxing);
		System.out.println("Float autoboxing:" + autoboxing1);
		System.out.println("Boolean autoboxing:" + autoboxing2);
		System.out.println("Int unboxing:" + unboxing);
		System.out.println("Float unboxing:" + unboxing1);
		System.out.println("Boolean unboxing:" + unboxing2);
	}

}
