import java.util.Scanner;

public class Problem15 {

	// �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
	// [0..24].
	// ���������� �� ������ ������������� ��������� ��������� ���������
	// ���.
	// ��������� ��:
	// [18..4] - ����� �����;
	// [4..9] - ����� ����;
	// [9..18] - ����� ���

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What time is it? (Enter an integer number betwin 0 and 23)");
		int time = sc.nextInt();
		if ((time > 23) || (time < 0)) {
			System.out.println("The number doesn't meet the requirement!");
		} else {
			if ((time >= 4) && (time < 9)) {
				System.out.println("Good morning!");
			}
			if ((time >= 9) && (time < 18)) {
				System.out.println("Good day!");
			}
			if (((time >= 18) && (time <= 23)) || ((time >= 0) && (time < 4))) {
				System.out.println("Good evening!");
			}
		}
		sc.close();
	}
}
