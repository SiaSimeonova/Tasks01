import java.util.Scanner;

public class Problem19 {
	
//	�� �� ������� ��������, ���� ����� �� �������� ���������� ����� �� ��������� [10..99]
//	�� ������� �������� �����, ��� �������� �� �������� ����������:
//	1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
//	2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
//	����������� ���������� ������ �� �� ������ �������� 1.
	
	
//	���� ������� � ������� ��� ����������. ��� ��� �������� �������� �� ������� �� ��������, ������
//	���������� ����� � 12 (11 � �������� �����������), � �� � �������� 11. � 11 ����� � �� �� ������, 
//	�� ���� �� ������ ���������� �� �������.

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number betwin 10 and 99");
		int a = sc.nextInt();
		int j = (a - 1);
		
		if (a < 10 || a > 99) {
			System.out.println("The number/ doesn't meet the requirement!");
		} else {
			while (j >= 1) {
				if (j == 1) {
					break;
				} else {
					if (j % 2 == 0) { 
						j *= (0.5);
						System.out.println(j);
					} else {
						j = ((j * 3) + 1);
						System.out.println(j);
					}
				}
			}
		}
		sc.close();
	}
}

