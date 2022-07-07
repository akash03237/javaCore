package banks;

public class Bank {
	private double interestRate;

	

	public double interestRate() {
		return 0.0;

	}

	public String getName() {
		return "";
	}

	public static Bank getBank(int i) {

		if (i == 1)
			return new AxisBank();
		if (i == 2)
			return new HdfcBank();
		if (i == 3)
			return new ICICIBank();
		return null;

	}
}
