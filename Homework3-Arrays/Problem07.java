import java.util.Scanner;

public class Problem07 {
	
//	�������� ��������, ����� ����� ���� ����� � ����� ������� ��� ����� ��� ����� ������ �� ������� �����:
//	���������� �� ����� ������� �� ������ ����� �� � ����� �� ����� �� ���������� � ���������� 
//	������� �� ���������� ������� �� ������ �����. �� �� ������ ��������� �����.
	
	
// ������� � ��������� ������� ��� ��������� ����, ����� ������������ �� ������������ �� 09.11.15 - 
// ������ - ���� �� ������ � ���������, ��������� - ���� �� ������ � �������������.
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Please enter the values in the array");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		int [] b = new int[a.length];
		for(int ind = 1; ind <b.length-1; ind++){
			b[ind] = a[ind-1]+a[ind+1];
		}
		b[0]=a[1]+a[length-1];
		b[length-1]=a[length-2]+a[0];
		for(int ind = 0; ind <b.length; ind++){
			System.out.print(b[ind]+" ");
		}
		sc.close();
	}

}
