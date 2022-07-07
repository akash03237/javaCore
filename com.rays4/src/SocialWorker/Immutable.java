package SocialWorker;

public final class Immutable {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	Immutable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Immutable i = new Immutable("akash", 50);

		System.out.println(i.getName());
		System.out.println(i.getAge());

	}
}
