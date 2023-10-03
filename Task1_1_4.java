package Lab2;

import java.util.Scanner;

public class Task1_1_4 {
	public static void main(String[] args) {
		double sum = 1.64558;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("So n: ");
			int n = scanner.nextInt();
			if (n < 0) {
				System.out.println("sai số");
				return;

			}
			for (int i = 0; i <= n; i++) {
				double term = 0.0;
				for (int j = 1; j <= 2 * i; j += 2) {
					term = 1 / (2 * 4 * 6 * j);
				}
				sum += term;

			}
			System.out.println("S(" + n + ") = " + sum);
		}
	}
}
