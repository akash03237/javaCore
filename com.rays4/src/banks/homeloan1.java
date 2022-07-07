package banks;

public class homeloan1 {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			Bank bank = new Bank();
			Bank b = bank.getBank(i);

			System.out.println(b.getName());
			System.out.println(b.interestRate());

		}

	}

}
