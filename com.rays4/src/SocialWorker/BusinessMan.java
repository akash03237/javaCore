package SocialWorker;

public class BusinessMan implements Richman, Social {

	@Override
	public void helpToOthers() {
		System.out.println("help to other" + "l80000");
		System.out.println("----------------------");
	}

	@Override
	public void earnMoney() {
		System.out.println("earned money" + "l2000");
		System.out.println("----------------------");

	}

	public void donation() {
		System.out.println("donation" + "l5000");
		System.out.println("----------------------");

	}

	@Override
	public void party() {
		System.out.println("parties" + "l8000");
		System.out.println("----------------------");

	}

	public static void main(String[] args) {
		BusinessMan bm = new BusinessMan();
		bm.earnMoney();
		bm.donation();
		bm.party();
		bm.helpToOthers();

	}

}
