import java.util.Scanner;

public class Problem16 {

	// �� �� ������� ��������, ���� ����� �� �������� 2 ���������� ����� N, M ��
	// ��������� [10..5555].
	// ����������, ���� ����� for, �� ������� ������ ����� �� ���������, �����
	// �� ������ �� 50 � �������� ���.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive integer number betwin 10 and 5555");
		int n = sc.nextInt();
		int m = sc.nextInt();
		if ((n > 5555 || n < 10) || (m > 5555 || m < 10)) {
			System.out.println("The numbers don't meet the requirement!");
		} else {
			if (n > m) {
				for (int i = n; i >= m; i--) {
					if (i % 50 == 0) {
						System.out.println(i);
					} else {
						continue;
					}
				}
			} else {
				if (m > n) {
					for (int i = m; i >= n; i--) {
						if (i % 50 == 0) {
							System.out.println(i);
						} else {
							continue;
						}
					}
				}
			}
		}
		sc.close();
	}
}