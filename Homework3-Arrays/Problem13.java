import java.util.Scanner;

public class Problem13 {
	
//	�� �� ������� ��������,���� ����� �� ������� ����� � �� ��������� ���� ����� � ������� ������ �������
//	����������, ���� �����, �� ��������� �������������� ������ ����� �� ���������� ���������� ����� �
//  2-���� ������ �������.
//	������: 99
//	�����: 1100011

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer number!");
		int num = sc.nextInt();
		int duplicateNum=num;
		int length =0;
		while(duplicateNum>=1){
			duplicateNum/=2;
			length++;
		}
		int [] a = new int [length];
		for(int i=0;i<=a.length-1;i++){
			a[i]=num%2;
			num/=2;
		}
		for(int i=length-1;i>=0;i--){
			System.out.print(a[i]);
		}
		sc.close();
	}
}
