import java.util.Scanner;

public class Problem14 {

	// �� �� ������� ��������, ����� �� �������� ���������� ����� N �� ���������
	// [10..200]
	// ������� � ������� ��� ������ �����, ����� �� ������ �� 7 � �� ��-����� ��
	// N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive integer number betwin 10 and 200");
		int num = sc.nextInt();
		if (num > 200 || num < 10) {
			System.out.println("The number don't meet the requirement!");
		} else {
			for (int i = num - 1; i > 6; i--) {
				if (i % 7 == 0) {
					System.out.println(i);
				} else {
					continue;
				}
			}
		}
		sc.close();
	}
}
