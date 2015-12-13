import java.util.Scanner;

public class Problem10 {

	// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
	// 3 ����� � �� �������� ������������.
	// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
	// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
	// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
	// ������ �����: ���������� ����� �� ��������� [10..9999].
	// ������: 107
	// �����: 21 ���� �� 2 �����,
	// 21 ���� �� 3 �����
	// ������������ ���� �� 2 �����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number betwin 10 and 9999.");
		int water = sc.nextInt();
		int result = water % 5;
		if (water > 9999 || water < 10) {
			System.out.print("The number doesn't meet the requirement!");
		} else {
			if (result == 0) {
				System.out.print((water / 5) + " times x 2 liters and " + (water / 5) + " times x 3 liters.");
			} else {
				if (result == 4) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " two times x 2 liters");
				}
				if (result == 3) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " one times x 3 liters");
				}
				if (result > 3) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " one times x 2 liters");
				}
			}
		}
		sc.close();
	}
}