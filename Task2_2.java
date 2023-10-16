package Lab4;

import java.util.Arrays;

public class Task2_2 {
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pivotIndex = getPivot_MedianOfThree(array, low, high);
			int pivotPosition = partition(array, low, high, pivotIndex);
			quickSort(array, low, pivotPosition - 1);
			quickSort(array, pivotPosition + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high, int pivotIndex) {
		int pivotValue = array[pivotIndex];
		swap(array, pivotIndex, high);
		int i = low;
		for (int j = low; j < high; j++) {
			if (array[j] >= pivotValue) {
				swap(array, i, j);
				i++;
			}
		}
		swap(array, i, high);
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static int getPivot_MedianOfThree(int[] array, int low, int high) {
		int mid = low + (high - low) / 2;
		int[] candidates = { array[low], array[mid], array[high] };
		int median = findMedian(candidates);
		if (median == array[low])
			return low;
		if (median == array[mid])
			return mid;
		return high;
	}

	private static int findMedian(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		int[] array = { 4, 2, 1, 12, 11 };

		quickSort(array);

		System.out.println("Sorted array in ascending order:");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}
}
