package Lab1;

import java.util.Arrays;

public class MyArray1_1_1 {
	private int[] array;

	public MyArray1_1_1(int[] array) {
		super();
		this.array = array;
	}

	public int[] mirror() {
		int[] result = new int[this.array.length * 2];
		int mirrorIndex = result.length - 1;
		for (int i = 0; i < array.length; i++) {
			result[i]=array[i];
			result[mirrorIndex--] = array[i];

		}
		return result;

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		MyArray1_1_1 ma = new MyArray1_1_1(array);
		int[] mirror = ma.mirror();
		System.out.println(Arrays.toString(mirror));

	} 

}