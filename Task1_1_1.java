package Lab2;

public class Task1_1_1 {
	public static void main(String[] args) {
		int n = 1;
		double KQ = 0;
		for (int i = 1; i <= n; i++) {
			double S = ((-1) ^ (i + 1)) * i;
			KQ += S;
		}
		System.out.println("S(" + n + ") = " + KQ);
	} 
} 
