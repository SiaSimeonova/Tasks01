import java.util.Scanner;

public class Problem24 {

	// ���� ����� X � ���������, a�� �� ���� ������� ������ ����� � �����
	// ������.
	// �� �� ������� ��������, ����� ��������� ���� �������� ����� � ���������.
	// ������ �����: N - ���������� ����� �� ��������� [10 .. 30000].

	// ������: 17571
	// �����: ������� � ���������

	// ����������� ����� do-while.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number betwin 10 and 30000");
		int number = sc.nextInt();
		int i = number;
		int addent = 1;
		int j = 0;
		if (number > 30000 ^ number < 10) {
			System.out.println("The number don't meet the requirement!");
		} else {
			while (i >= 1) {
				addent = i % 10;
				j = (j * 10) + addent;
				i /= 10;
			}
			if (j == number) {
				System.out.println("The number is palindrome!");
			} else {
				System.out.println("The number is not palindrome!");
			}
		}
		sc.close();
	}
}
