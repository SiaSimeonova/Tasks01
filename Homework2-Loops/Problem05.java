import java.util.Scanner;

public class Problem05 {

	// �� �� ������� �� ����������� 2 �����. � �� ��
	// ������� �� ������ ������ ����� �� ��-������� �� ��-��������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers.");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber >= secondNumber) {
			while (secondNumber <= firstNumber) {
				System.out.println(secondNumber);
				secondNumber++;
			}
		} else {
			while (firstNumber <= secondNumber) {
				System.out.println(firstNumber);
				firstNumber++;
			}
		}
		sc.close();
	}
}
