package epam.study1;

public class Main {

	public static void main(String[] args) {
		int size = 20; 
		int[] q = Cycle_1.getArrayFor(size);
		System.out.println("For:");
		for (int i = 0; i < size; i++) {
			System.out.print(q[i] + " ");

		}
		System.out.println();
		System.out.println("While:");
		q = Cycle_1.getArrayWhile(size);
		for (int i = 0; i < size; i++) {
			System.out.print(q[i] + " ");

		}
		System.out.println();
		System.out.println("Do while:");
		q = Cycle_1.getArrayDoWhile(20);
		for (int i = 0; i < size; i++) {
			System.out.print(q[i] + " ");

		}

	}

}
