import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
//		�� �� ������� ����� � �� �� ������ ���-������� ����� ������ ��
//		3 �� ������.		
//		10, 3, 5, 8, 6, -3, 7
//		���-������� ����� ������ �� 3 � -3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ��������� �� ������.");
		int length = sc.nextInt();
		int [] a = new int [length];
		System.out.println("���� �������� ����������� � ������.");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int min = a[0];
		for(int i=0; i<=a.length-1;i++){
			if(a[i]%3==0){
				if(min>a[i]){
					min=a[i];
				}
			}
		}
		System.out.println("���-������� �����, ������ �� ��� �: "+min);
		sc.close();
	}
}
