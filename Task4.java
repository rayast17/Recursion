package Tasks_1;

import java.util.Scanner;

public class Task4 {

	public static int powRecursive(int x, int n) {
		if (n > 0) {
			return (x * powRecursive(x, n - 1));
		} else {
			return 1;
		}
	}
 
	public static int powItterative(int x, int n) {
		int izhod = 1;
		while (n > 0) {
			izhod *= x;
			n--;
		}
		return izhod;
	}

	public static void main(String[] args) {

		System.out.println("Enter base and power: ");
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int n = reader.nextInt();
		System.out.print("Itterative: " + powItterative(x, n));
		System.out.print("Recursive: " + powRecursive(x, n));
	}

}