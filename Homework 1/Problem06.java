import java.util.Scanner;

public class Problem06 {

	// �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
	// �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
	// �3 �� ��� ������� �������� �� �1.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three different numbers (a1, a2, a3)");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		double a3 = sc.nextDouble();
		double a4 = a1;
		a1 = a2;
		a2 = a3;
		a3 = a4;
		System.out.println("The new value of a1 is: " + a1);
		System.out.println("The new value of a2 is: " + a2);
		System.out.println("The new value of a3 is: " + a3);
		sc.close();
	}
}
