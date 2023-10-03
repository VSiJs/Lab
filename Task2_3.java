package Lab2;

import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập độ cao của cây thông: ");
		int n = scanner.nextInt();

		int space = n - 1;
		int stars = 1;

		for (int i = 1; i <= n; i++) {
			// In khoảng trắng phía trước
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			// In ký tự 'X'
			for (int k = 1; k <= stars; k++) {
				System.out.print("X");
			}
			// Xuống dòng sau khi in xong mỗi hàng
			System.out.println();

			// Điều chỉnh khoảng trắng và số 'X' cho hàng tiếp theo
			space--;
			stars += 2;
		}

		// In cành cây dưới
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("X");
		}

		space = n - 2;
		stars = 3;
 
		for (int i = 1; i <= n - 1; i++) {
			// In khoảng trắng phía trước
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// In ký tự 'X'
			for (int k = 1; k <= stars; k++) {
				System.out.print("X");
			}

			// Xuống dòng sau khi in xong mỗi hàng
			System.out.println();

			// Điều chỉnh khoảng trắng và số 'X' cho hàng tiếp theo
			space--;
			stars += 2;
		}
		// In cành cuối
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= n - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("X");
		}

		space = n - 2;
		stars = 3;

		for (int i = 1; i <= n - 1; i++) {
			// In khoảng trắng phía trước
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}

			// In ký tự 'X'
			for (int k = 1; k <= stars; k++) {
				System.out.print("X");
			}

			// Xuống dòng sau khi in xong mỗi hàng
			System.out.println();

			// Điều chỉnh khoảng trắng và số 'X' cho hàng tiếp theo
			space--;
			stars += 2;

			// Đóng Scanner sau khi sử dụng
			scanner.close();
		}
	}
} 
