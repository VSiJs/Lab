package Lab2;

import java.util.Scanner;

public class Task2_2_3 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("n: ");
			int n = scanner.nextInt();
			printPyramid(n);
		}
	}

	public static void printPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k+=2) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

	} 
}  
     