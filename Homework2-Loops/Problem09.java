import java.util.Scanner;

public class Problem09 {

	// �� �� �������� 2 ����� �� ������������ � � �.
	// �� �� ������� ������ ����� �� � �� � �� ������ 2 (��������� � �������).
	// ��� ����� ����� � ������ �� 3, �� �� ������ ��������� �� ������� ��
	// �������� �skip 3�.
	// ��� ������ �� ������ �������� ����� (��� ������������) ����� ��-������ ��
	// 200, �� �� �������� �����������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int step = 0;
		int count200 = 0;
		if ((a + step) <= b) {
			while (a + step <= b) {
				int sum = a + step;
				if ((a + step) % 3 == 0) {
					System.out.print("skip3" + ", ");
				} else {
					count200 += (sum * sum);
					if (count200 >= 200) {
						break;
					} else {
						System.out.print(sum * sum + ", ");
					}
				}
				step++;
			}
		} else {
			while (b + step <= a) {
				int sum = b + step;
				if ((b + step) % 3 == 0) {
					System.out.print("skip3" + ",");
				} else {
					count200 += (sum * sum);
					if (count200 >= 200) {
						break;
					} else {
						System.out.print(sum * sum + ",");
					}
				}
				step++;
			}
		}
		sc.close();
	}
}
