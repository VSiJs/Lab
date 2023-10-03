package Lab2;

import java.util.Scanner;

public class Task1_2_2 { 
	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibo(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibo(count - 1); 
		} 
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("số lượng Fibo: ");
			int count = scanner.nextInt();
			if (count <= 0) {
				System.out.println("sai số");
				return;

			}
			System.out.print(n1 + " " + n2);
			printFibo(count - 2);
		}
	}
}
  