package Lab4;

public class Task1_1 {
	public static void selectionSort(int[] array) {
	    int n = array.length;
	    
	    for (int i = 0; i < n - 1; i++) {
	        int maxIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (array[j] > array[maxIndex]) {
	                maxIndex = j;
	            }
	        }
	        int temp = array[i];
	        array[i] = array[maxIndex];
	        array[maxIndex] = temp;
	    }
	}

	public static void main(String[] args) {
	    int[] array = {64, 13, 12, 22, 11};
	    
	    selectionSort(array);
	    
	    System.out.println("Mang da loc: ");
	    for (int value : array) {
	        System.out.print(value + " ");
	    }
	}


}
