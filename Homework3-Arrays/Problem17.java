import java.util.Scanner;

public class Problem17 {

	// ���� ������ �� ���������� ����� �� �������� �������������� ������, ��� �� ���������� � ��
	// ���������� ���������: N1 < N2 > N3 < N4 > N5 <..
	// ��������� ��������, ����� ��������� ���� �������� � ��������� �����  ������ �� �����
	// ���������� ������� ����������.
	// ������: 1 3 2 4 3 7
	// �����: ��������� ������������ �� �������������� ������ ������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� ��������� �� ������(���� ����� > 2).");
		int length = sc.nextInt();
		if(length<3){
			System.out.println("���������� ����� �� �������� �� �����������!");
		}
		int [] a = new int [length];
		System.out.println("���� �������� ����������� � ������.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean isZigZag = true;
		for (int i = 1; i < a.length-1; i++) {
			if (!((a[i] > a[i + 1] && a[i] > a[i - 1]) || (a[i] < a[i + 1] && a[i] < a[i - 1]))) {
				System.out.println("�������� �� � ��������������!");
				isZigZag = false;
				break;
			}
			if (isZigZag && a[0] < a[1]) {
				System.out.println("�������� ��������� ��������� �� �������������� ������ ������!");
				break;
			} else {
				if (isZigZag && a[0] > a[1]) {
					System.out.println("�������� ��������� ��������� �� �������������� ������ ������!");
					break;
				}
			}
		}
		sc.close();
	}
}
