package pr11;

public class Testsum {
	public static void main(String[] args) {
		int sum = 0;
		int value = 0;
		for (int n = 100; n <= 200; n++) {
			if (n % 7 == 0) {
				sum = n + sum;
				value++;
			}

		}
		System.out.println("the sum is "+sum);
	}
}
