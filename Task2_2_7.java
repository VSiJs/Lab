package Lab2;

import java.util.Scanner;

public class Task2_2_7 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("n: ");
			int n = scanner.nextInt();
			printPyramid(n);
		}
	}

	public static void printPyramid(int n) {
		for (int i = n; i >= 1; i -= 1) {
			for (int j = 1; j <= n - i; ++j) {
				System.out.print("    ");
			}
			for (int k = 1; k <= 2 * i - 1; k += 2) {
				System.out.print("    ");
				System.out.print(i);
			}
			System.out.println(); 

		}
		System.out.println();

	}
} 
