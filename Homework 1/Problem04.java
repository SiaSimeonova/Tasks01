import java.util.Scanner;

public class Problem04 {

	// �������� 2 �������� ����� �� ��������� � �� ������������ �
	// ��������� ���.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two different numbers: A and B");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		if (A == B) {
			System.out.println("The numbers are equal!");
		} else {
			if (A > B) {
				System.out.println(B);
				System.out.println(A);
			} else {
				System.out.println(A);
				System.out.println(B);
			}
		}
		sc.close();
	}
}
