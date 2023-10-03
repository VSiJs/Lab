package Lab1;

public class MyArray1_2_2 {
	   public static void main(String[] args) {
	        int[] input = {10, 11, 12, -1, 14, 10, 17, 19, 20};
	        int k = 3;
	        
	        int[] output = fillMissingValues(k, input);
	        
	        // In ra màn hình kết quả
	        for (int value : output) {
	            System.out.print(value + " ");
	        }
	    }

	    public static int[] fillMissingValues(int k, int[] input) {
	        if (input == null || input.length == 0 || k <= 0) {
	            return null;
	        } 

	        int[] output = new int[input.length];

	        for (int i = 0; i < input.length; i++) {
	            if (input[i] == -1) {
	                int sum = 0;
	                int count = 0;

	                // Tính tổng các giá trị trong cửa sổ kích thước k
	                for (int j = Math.max(0, i - k); j <= Math.min(input.length - 1, i + k); j++) {
	                    if (input[j] != -1) {
	                        sum += input[j];
	                        count++;
	                    }
	                }

	                // Tính trung bình và gán vào giá trị thiếu
	                if (count > 0) {
	                    output[i] = sum / count;
	                } else {
	                    // Nếu không có giá trị hợp lệ trong cửa sổ, gán bằng 0
	                    output[i] = 0;
	                }
	            } else {
	                output[i] = input[i];
	            }
	        }

	        return output;
	    }
}
