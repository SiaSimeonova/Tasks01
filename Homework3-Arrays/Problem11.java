import java.util.Scanner;

public class Problem11 {

	// �� �� ������� ��������, ����� ������� �� ������������ 7 ���� ����� � ��������� �����
	// ���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
	// ������: -23, -55, 17, 75, 56, 105, 134
	// �����: 75,105 2 �����

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		System.out.println("���� �������� ����� ���� �����.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum =0;
		System.out.print("�������, ��-������ � ������ �� 5 ��: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 5 && a[i] % 5 == 0) {
				System.out.print(a[i] + ", ");
				sum++;
				}
			if(i==a.length-1){
				System.out.println(sum+" �����");
			}
		}
		sc.close();
	}

}
