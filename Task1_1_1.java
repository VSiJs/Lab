package Lab3;

import java.util.Scanner;

public class Task1_1_1 {
	private int[] array;

	public Task1_1_1(int[] array) {
		this.array = array;
	}

	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap cai target: ");
			int target = scanner.nextInt();

			int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
			Task1_1_1 myArray = new Task1_1_1(array);
			int result = myArray.iterativeLinearSearch(target);
			int iterativeLinearSearch = -1; 
			if (result != -1) {
				System.out.println("Cai target " + target + " tim dc tai : " + result);
			} else {
				System.err.println("Cai target " + target + " ko thay " + iterativeLinearSearch);
			}
		}
	}
}
