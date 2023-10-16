package Lab4;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;

			for (int i = 0; i < n - 1; i++) {
				if (array[i] < array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}

	public static void main(String[] args) {
		int[] array = { 64, 13, 12, 22, 11 };
		bubbleSort(array);
		System.out.println("Mang da loc:");
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

}
