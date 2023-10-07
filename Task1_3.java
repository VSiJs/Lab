package Task_1;

public class Task1_3 {
	//Task 1.3: How to change the implemented methods so that they can be used for the 
	//case in which the array is sorted by descending order
	private int[] array;
	
	public Task1_3(int[] array) {
		this.array = array;
	}
	public int iterativeBinarySearchDescending(int target) {
	    int left = 0;
	    int right = array.length - 1;

	    while (left <= right) {
	        int mid = (left + right) / 2;

	        if (array[mid] == target) {
	            return mid; // Muc tieu dc tim thay o muc giua
	        }

	        if (array[mid] > target) {
	            left = mid + 1; // loai bo nua ben trai cua mang
	        } else {
	            right = mid - 1; // loai bo nua ben phai cua mang
	        }
	    }

	    return -1; // ko tim thay muc tieu trong mang
	}
	public int recursiveBinarySearchDescending(int target) {
	    return recursiveBinarySearchHelperDescending(target, 0, array.length - 1);
	}

	private int recursiveBinarySearchHelperDescending(int target, int left, int right) {
	    if (left > right) {
	        return -1; // ko tim thay muc tieu trong mang
	    }

	    int mid = (left + right) / 2;

	    if (array[mid] == target) {
	        return mid; // muc tieu dc tim thay la diem o giua
	    } else if (array[mid] > target) {
	        return recursiveBinarySearchHelperDescending(target, left, mid - 1); // Recurse on the left half of the array
	    } else {
	        return recursiveBinarySearchHelperDescending(target, mid + 1, right); // Recurse on the right half of the array
	    }
	}
	public static void main(String[] args) {
		int[] array = {12, 10, 9, 45, 2, 10, 10, 45};
		Task1_3 a3 = new Task1_3(array);
		
		int target1 = 45;
		int index1 = a3.iterativeBinarySearchDescending(target1);
		System.out.println(index1);
		int target = 10;
		int index = a3.recursiveBinarySearchDescending(target);
		System.out.println(index);
	}
}
