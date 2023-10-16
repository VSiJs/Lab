package Lab4;

public class Task1_3 {
	public static void insertionSort(int[] array) {
	    int n = array.length;

	    for (int i = 1; i < n; i++) {
	        int key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] < key) {
	            array[j + 1] = array[j];
	            j--;
	        }

	        array[j + 1] = key;
	    }
	}

	public static void main(String[] args) {
	    int[] array = {42, 15, 12, 21, 11};

	    insertionSort(array);

	    System.out.println("Mang da loc:");
	    for (int value : array) {
	        System.out.print(value + " ");
	    }
	}


}
