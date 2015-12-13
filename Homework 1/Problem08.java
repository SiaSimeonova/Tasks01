import java.util.Scanner;

public class Problem08 extends Problem01 {

	// �� �� ������� ��������, ����� ���� �� ��������� 4-������o
	// ���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
	// �������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
	// � 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
	// 3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
	// ���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
	// ������: 3332 �����: ��-����� (32<33)
	// ������: 1144 �����: ����� (14=14)
	// ������: 9875 �����: ��-������ (95>87)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number betwin 1000 and 9999");
		int a = sc.nextInt();
		int n4 = a % 10;
		int n3 = ((a % 100) / 10);
		int n2 = ((a % 1000) / 100);
		int n1 = ((a % 10000) / 1000);
		int new1 = ((n1 * 10) + n4);
		int new2 = ((n2 * 10) + n3);
		if (a > 9999 || a < 1000) {
			System.out.print("The number doesn't meet the requirement!");
		} else {
			if (new1 > new2) {
				System.out.println("biger: " + new1 + ">" + new2);
			}
			if (new1 < new2) {
				System.out.println("smaller: " + new1 + "<" + new2);
			}
			if (new1 == new2) {
				System.out.println("equal: " + new1 + "=" + new2);
			}
		}
		sc.close();
	}
}
