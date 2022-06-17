package pr11;

import java.time.*;

public class Maintenance {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("\nCurrent Date: " + today);
		System.out.println("maintenance date from today will be " + today.plusDays(30));

		System.out.println("maintenance date next will be " + today.plusDays(60));
		System.out.println("maintenance date next will be " + today.plusDays(90));

		System.out.println("maintenance date next will be " + today.plusDays(120));

		System.out.println("maintenance date next will be " + today.plusDays(150));

		System.out.println("maintenance date next will be " + today.plusDays(180));

	}
}
