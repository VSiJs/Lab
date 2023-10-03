package Lab2;

public class Task1_4 {
	public static void main(String[] args) {
		int n = 3; // số vòng
		char fromPeg = 'A'; // Cột đầu
		char toPeg = 'C'; // Cột cuối
		char auxPeg = 'B'; // Cột giữa

		System.out.println("Với " + n + " vòng:");
		towerHanoi(n, fromPeg, toPeg, auxPeg);
	}

	public static void towerHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
		if (n == 1) {
			System.out.println("Di chuyển vòng 1 từ " + fromPeg + " đến " + toPeg);
			return;
		}
		towerHanoi(n - 1, fromPeg, auxPeg, toPeg);

		System.out.println("Di chuyển vòng " + n + " từ " + fromPeg + " đến " + toPeg);

		towerHanoi(n - 1, auxPeg, toPeg, fromPeg);
	}
}
