import java.util.Scanner;

public class Problem06 {

	// �� �� ������� ����� �� ������(���������) � �� ��
	// ������ ����� �� ������ ����� ����� 1 � ���������� �����.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number.");
		int number = sc.nextInt();
		int augent = 1;
		int addent = 2;
		if (number <= 0) {
			System.out.println("The entered number don't meet the reqirement!");
		} else {
			while (addent <= number) {
				augent += addent;
				addent++;
			}
			System.out.println(augent);
		}
		sc.close();
	}
}
