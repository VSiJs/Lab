package Lab1;

import java.util.ArrayList;
import java.util.List;

public class MyArray1_2_1 {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 13, 13, 14, 16, 17, 19, 20 };

		List<Integer> missingNumbers = findMissingNumbers(arr, 10, 20);

		System.out.println("So bi thieu:");
		for (int missingNumber : missingNumbers) {
			System.out.print(missingNumber + " ");
		}
	}

	public static List<Integer> findMissingNumbers(int[] inputNumbers, int start, int end) {
		List<Integer> missingNumbers = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			boolean found = false;
			for (int num : inputNumbers) {
				if (num == i) {
					found = true;
					break;
				} 
			}
			if (!found) {
				missingNumbers.add(i);
			}
		} 

		return missingNumbers; 
	} 
}
