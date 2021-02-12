package Tasks_1;

public class Task3 {
	public static void main(String[] args) {

		System.out.print(Re2pow(4));
		System.out.println();
		System.out.print(It2pow(2, 4));
	}

	public static int Re2pow(int n) {
		if (n == 0) {
			return 1;
		}
		return 2 * Re2pow(n - 1);

	}

	public static int It2pow(int chislo, int stepen) {
		int izhod = 1;
		while (stepen > 0) {
			izhod *= chislo;
			stepen--;
		}
		return izhod;
	}

}