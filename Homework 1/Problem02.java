import java.util.Scanner;

public class Problem02 {
	
//	�������� 2 �������� ����������� ����� �� ���������. ��������
//	������� ����, �������, ������������, ������� �� ������� �
//	����������� ������� � ������� ���������� � ������������ ����
//	��������� � ���������. �������� ������ � ����� � ������� �������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two different numbers (A & B).");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a > b) {
			System.out.println("The sum of A+B is: " + (a + b));
			System.out.println("The difference A-b is: " + (a - b));
			System.out.println("The product A*B is: " + (a * b));
			System.out.println("The remainder A%B is: " + (a % b));
			System.out.println("The quotient A/B is: " + (a / b));
		} 
		else {
			System.out.println("The sum of A+B is: " + (a + b));
			System.out.println("The difference B-A is: " + (b - a));
			System.out.println("The product A*B is: " + (a * b));
			System.out.println("The remainder B%A is: " + (b % a));
			System.out.println("The quotient B/A is: " + (b / a));
		}
		sc.close();
	}
}
