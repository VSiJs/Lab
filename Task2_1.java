package Lab4;

public class Task2_1 {
	public static void mergeSort(int[] array) {
		if (array == null) {
			return;
		}

		int n = array.length;

		if (n > 1) {
			int middle = n / 2;
			int[] leftHalf = new int[middle];
			int[] rightHalf = new int[n - middle];
			System.arraycopy(array, 0, leftHalf, 0, middle);
			System.arraycopy(array, middle, rightHalf, 0, n - middle);
			mergeSort(leftHalf);
			mergeSort(rightHalf);
			merge(array, leftHalf, rightHalf);
		}
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] >= right[j]) {
				result[k] = left[i];
				i++;
			} else {
				result[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			result[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			result[k] = right[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] array = { 64, 25, 12, 22, 11 };

		mergeSort(array);

		System.out.println("Mang da loc:");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

}
