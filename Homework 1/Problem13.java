import java.util.Scanner;

public class Problem13 {

	// �� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
	// ���������� ����������� t � ������ ������.
	// �������������� ��������� ��:
	// ��� -20 ������ �������;
	// ����� 0 � -20 - �������;
	// ����� 15 � 0 - ������;
	// ����� 25 � 15 - �����;
	// ��� 25 � ������.
	// ������ �����: ���� ����� �� ��������� [-100..100].
	// ������: 12
	// �����: ������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much degrees is the temperature now.(from-100 to 100");
		double degrees = sc.nextDouble();
		if (degrees < -100 || degrees > 100) {
			System.out.print("The number doesn't meet the requirement!");
		} else {
			if (degrees <= -20) {
				System.out.print("It is freezing cold!");
			}
			if (degrees <= 0 && degrees > -20) {
				System.out.print("It is cold!");
			}
			if (degrees <= 15 && degrees > 0) {
				System.out.print("It is cool!");
			}
			if (degrees <= 25 && degrees > 15) {
				System.out.print("It is warm!");
			}
			if (degrees > 25) {
				System.out.print("It is hot!");
			}
		}
		sc.close();
	}
}
