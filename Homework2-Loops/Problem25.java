import java.util.Scanner;

public class Problem25 {
	
//	�� �� ������� ��������, ����� �� ������ ����� N, �� ��������� N!, �.�. 1*2*3*4...*N.
//	
//	������: 5
//	�����: 120
//	����������� ����� do-while.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number.");
		int n = sc.nextInt();
		int a = 1;
		int b = 2;
		
		do{
			a*=b;
			b++;
		}while(b<=n);
		System.out.println(a);
		sc.close();
	}
}
