import java.util.Scanner;

public class Problem09 {

	// �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
	// ���������� ����� a,b.
	// ���������� �� ������ � ��������� ���� ���������� ����� ��
	// �������������� �� ����� ����� � �����, ����� � ������ �����.
	// ������ �����: a,b - ���������� ����� �� ��������� [10..99].
	// ������: 15, 25
	// �����: 375, 5 �������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double-digits integer numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int multiplication = (number1 * number2);
		int lastdigit = multiplication % 10;
		if ((number1 > 100 || number1 < 10) || (number2 > 100 || number2 < 10)) {
			System.out.print("The numbers don't meet the requirement!");
		} else {
			if (lastdigit % 2 == 0) {
				System.out.println(multiplication + ", " + lastdigit + " " + "evan");
			} else {
				System.out.println(multiplication + ", " + lastdigit + " " + "odd");
			}
		}
		sc.close();
	}
}
