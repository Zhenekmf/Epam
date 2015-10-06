package epam.study1;

public class Cycle_1 {

	public static int[] getArrayFor(int size) {
		int[] ret = new int[size];
		boolean flag = false;
		int j = 2;

		for (int i = 0; i < size; i++) {
			ret[i] = j;
			j += 2;
			if (flag) {
				ret[i] *= ret[i - 1];

			}
			flag = !flag;

		}

		return ret;
	}

	public static int[] getArrayWhile(int size) {
		int[] ret = new int[size];
		int i = 0;
		int j = 2;
		boolean flag = false;
		while (i < size) {
			ret[i] = j;
			if (flag) {
				ret[i] *= ret[i - 1];
			}
			flag = !flag;
			i++;
			j += 2;
		}

		return ret;

	}

	public static int[] getArrayDoWhile(int size) {
		int[] ret = new int[size];
		int i = 0;
		int j=2;  
		boolean flag = false;
		do {
			ret[i] = j;
			if (flag) {
				ret[i] *= ret[i - 1];
			}
			flag = !flag;
			j+=2;
			i++;
		} while (i < size);

		return ret;
	}

}
