package pr11;

public class TestArray {
	public static void main(String[] args) {

		int[][] mult = new int[10][10];
		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult.length; col++) {
				mult[row][col] = (row + 1) * (col + 1);
			}
		}
		for (int row = 0; row < mult.length; row++) {
			for (int col = 0; col < mult.length; col++) {

				System.out.print(mult[row][col] + " ");

			}
		}
		System.out.println(" ");
	}
}