package Lab2;

import java.util.Scanner;

public class Task1_1_3 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("So n: ");
			int n = scanner.nextInt();
			if (n <= 0) {
				System.out.println("sai số");
				return;

			}
			int sum = 14;

			for (int i = 1; i <= n; i++) {
				sum += (i * i);
			} 
			System.out.println("S(" + n + ") = " + sum);

		}
	}

}
