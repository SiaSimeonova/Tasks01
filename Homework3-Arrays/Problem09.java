import java.util.Scanner;

public class Problem09 {

	// �������� ��������, � ����� ����������� ������� �����, ���� ����� ���������� �� ������ �� �������
	// � ������� ��� (����� �� � ������ �� �� �������� � ������� ���, ��� ����� �� �� ������, ���� �����
	//  �� �� �������� � �������� ���).
	// ��������� �� ������ �������� ����� � ���� ������������ ����� � ����� ��� �� ���������� ���� �����.
	//

	public static void main(String[] args) {

		// ����� ������� - � ������������ �����

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter length of the array");
		// int length = sc.nextInt();
		// int[] a = new int[length];
		// System.out.println("Please enter the values in the array");
		// for (int i = 0; i <= a.length - 1; i++) {
		// a[i] = sc.nextInt();
		// }
		// int [] b = new int[a.length];
		// for(int ind = 0; ind <length; ind++){
		// b[ind] = a[length-1-ind];
		// }
		// for(int ind = 0; ind <length; ind++){
		// a[ind] = b[ind];
		// System.out.print(a[ind]+" ");
		// }
		// }
		//
		// }

		// ����� ������� - ��� ������������ �����

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Please enter the values in the array");

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		if (length % 2 != 0) {
			for (int i = 0; i < (a.length - 1) / 2; i++) {
				a[i] = a[length - 1 - i] + a[i];
			}
			for (int i = a.length - 1; i > a.length / 2; i--) {
				a[i] = (a[i] - a[length - 1 - i]) * (-1);
			}
			for (int i = 0; i < (a.length - 1) / 2; i++) {
				a[i] = a[i] - a[length - 1 - i];
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			for (int i = 0; i < (a.length) / 2; i++) {
				a[i] = a[length - 1 - i] + a[i];
			}
			for (int i = a.length - 1; i >= a.length / 2; i--) {
				a[i] = (a[i] - a[length - 1 - i]) * (-1);
			}
			for (int i = 0; i < (a.length) / 2; i++) {
				a[i] = a[i] - a[length - 1 - i];
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		sc.close();
	}
}
