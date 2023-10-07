package Lab3;

import java.util.Scanner;

public class Task1_1_2 {
	private int[] array;

	public Task1_1_2(int[] array) {
		this.array = array;
	}

	public int recursiveLinearSearch(int target) {
		return Helper(target, 0);
	}

	private int Helper(int target, int currentIndex) {
		if (currentIndex >= array.length) {
			return -1;
		}
		if (array[currentIndex] == target) {
			return currentIndex;
		}
		return Helper(target, currentIndex + 1);
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int target = scanner.nextInt();

			int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
			Task1_1_2 myArray = new Task1_1_2(array);

			int result = myArray.recursiveLinearSearch(target);
			int b = -1;
			if (result != -1) {
				System.out.println(" Cai target " + target + " tim dc tai : " + result);
			} else {
				System.out.println("Cai target " + target + " ko thay : " + b);
			}
		} 
	}
}
