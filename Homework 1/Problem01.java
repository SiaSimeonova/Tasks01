import java.util.Scanner;

public class Problem01 {
	
//	�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//	������������ A � B (���� �� �� � ������� ������� � double).
//	����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//	�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two different numbers A and B.");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	System.out.println("Enter third number C");
	double c = sc.nextDouble();
		if(((a>c) && (c>b)) || ((a<c) && (c<b))){
			System.out.println("The third number C is betwin A and B.");
		}else{
			System.out.println("The third number C is not betwin A and B.");
		}
		sc.close();
	}

}

