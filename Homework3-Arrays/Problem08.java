import java.util.Scanner;

public class Problem08 {

	// �������� ��������, ����� ������ � ������� ���-������� ������ �� ������� ������� �������� � ����� �����.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ��������� �� ������.");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("���� �������� ����������� � ������.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int prevSum = 0;
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				sum++;
				if (sum > prevSum) {
					prevSum = sum;
					index = i;
				}
			} else {
				sum = 0;
			}
		}
		System.out.print("���-������� ������ �� ������� ������� �������� �: ");
		while (prevSum >= 0) {
			System.out.print(a[index] + " ");
			prevSum--;
		}
		sc.close();
	}
}
