import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Size:");
		int s = new Scanner(System.in).nextInt();
		int[][] ar = new int[s][s];
		for (int i = 0; i < s; i++) {
			ar[i][i] = 1;
			ar[s - i - 1][i] = 1;
		}

		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
