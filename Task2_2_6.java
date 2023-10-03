package Lab2;

import java.util.Scanner;

public class Task2_2_6 {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("n: ");
			int n = scanner.nextInt();
			printPyramid(n);
		}
	}

	public static void printPyramid(int n) {
		for (int i = n ; i >= 1; i-=1) {
			for (int space = 1; space <= n - i; ++space) {
				System.out.print("  ");
			}
			 for(int j=i; j <= 2 * i - 1; ++j) {
			        System.out.print("* ");
			      }

			      for(int j = 0; j < i - 1; ++j) {
			        System.out.print("* ");
			      } 
  
			      System.out.println();
		} 
	}  
}    
   