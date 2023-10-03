package Lab1;

import java.util.Arrays;
public class MyArray1_1_2 {
	public static void main(String[] args) {
		//Cho mang goc
		int[] arr = {1,3,5,1,3,7,9,8};
		
		Arrays.sort(arr);
		
		int uniqueCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueCount++;
            }
        }
		 uniqueCount++;  
		 //Tao mang moi voi kich thuoc da xac dinh
		 int[ ]uniqueArray = new int[uniqueCount];
		 int j = 0;
		 for (int i = 0; i < arr.length - 1 ; i++ ) {
			 if (arr[i] != arr[i +1]) {
				 uniqueArray[j++] = arr[i];
			 }
		 }
		 uniqueArray[j] = arr[arr.length - 1 ];
		 System.out.println("Mang sau khi loc ");
		 for (int num : uniqueArray) {
			 System.out.println(num + " ");
		 }
	}
	 
}
