import java.util.Scanner;

public class Problem07 {

	// �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
	// ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
	// ��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
	// ������� �����:
	// - ��� ��� �����, ���� �� �������
	// - ��� ���� ����, �� �� ���� ���������
	// - ��� ����� � �� ���� ����� � �� ��� ���
	// - ��� ��� �����, �� ����� �� ���� � ��������
	// - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
	// ���������� ������� �������� ���� ��������� � ���������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What time is it? - enter an integer number betwin 0 and 23");
		int time = sc.nextInt();
		if ((time < 0) || (time > 23)) {
			System.out.print("The value of time don't meet the requirement!");
		}
		System.out.println("How much money do I have? - enter a floating point number");
		float money = sc.nextFloat();
		System.out.println("Im I healthy? - enter true or false");
		boolean healthy = sc.nextBoolean();

		if ((healthy == false) && (money > 10)) {
			System.out.println("I will buy a medicine and stay at home.");
		}
		if ((healthy == false) && (money < 10)) {
			System.out.println("I will stay home and drink a cup of tea.");
		}
		if ((healthy == true) && (money > 10)) {
			System.out.println("I will go with friends to the cinema.");
		}
		if ((healthy == true) && (money < 10)) {
			System.out.println("I will go with friends to the cafe.");
		}
		sc.close();
	}
}
