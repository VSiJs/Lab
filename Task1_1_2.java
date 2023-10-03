package Lab2;

public class Task1_1_2 {
	 public static void main(String[] args) {
	        int n = 2; 
	        double sum = 9;
	        double term = 1;

	        for (int i = 1; i <= n; i++) {
	            term *= i;  
	            sum += term; 
	        }

	        System.out.println("S(" + n + ") = " + sum);
	    }
}
 
