package Task_1;

public class Task1_2 {
	private int[] array;
	public Task1_2(int[] array) {
		this.array = array;
	}
	// To find the index of the target in the sorted array. If the 
	//target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
	int left = 0;
	int right = array.length -1;

	while(left <= right){
		int mid = left + (right - left) / 2;
		
		if (array[mid] == target) {
			return mid; // Muc tieu dc tim thay o muc giua
			}else if (array[mid] < target) {
				left = mid + 1; // loai bo nua ben trai cua mang
			}else {
				right = mid - 1; // loai bo nua ben phai cua mang
			}
	}
	
	return -1; // ko tim thay muc tieu trong mang
	
	}
	// To find the index of the target in the sorted array. If the 
	//target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
	return recursiveBinarySearchHelper(target, 0, array.length - 1);
	}
	private int recursiveBinarySearchHelper(int target, int left, int right) {
		if (left > right) {
			return -1; //ko tim thay muc tieu trong mang
		}
		int mid = left + (right - left) / 2; // mid: diem o giua
		  
		if (array[mid] == target) {
			return mid; //muc tieu dc tim la diem o giua
		}else if (array[mid] < target) {
			return recursiveBinarySearchHelper(target, mid + 1, right); // lap lai o nua ben phai mang 
		}else {
			return recursiveBinarySearchHelper(target, left, mid - 1); // lap lai o nua ben trai mang
	    }
	}
	public static void main(String[] args) {
		int array[] = {12, 10, 9, 45, 2, 10, 10, 45};
		Task1_2 a2 = new Task1_2(array);
		// test iterativeBinarySearc
		int  target_1 = 15;
		int index_1 = a2.iterativeBinarySearch(target_1);
		System.out.println("Neu Target la " + target_1 + " thi Index la : " + index_1);
		// test recurstiveBinarySearc
		int target_2 = 45;
		int index_2 = a2.recursiveBinarySearch(target_2);
		System.out.println("Neu Target la " + target_2 + " thi Index la : " + index_2);
	}
}
