import java.util.Scanner;

public class Problem06 {

	// �� �� ������� ��������, ���� ����� �� ������� ��������� � ������� ����. ���� �������� �� ������
	//  �� �� ������� ����� �����, �� ����� ������� ���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
	// 
	// ������: ����� ����� ������
	// �����: ����� ����� ������

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a strings ");
		String a = sc.nextLine();
		a=a.toLowerCase();
		a = a.substring(0, 1).toUpperCase() + a.substring(1);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				int index = i;
				a = a.substring(0, index + 1) + a.substring(index + 1, index + 2).toUpperCase()
						+ a.substring(index + 2);
			}
		}
		System.out.println(a);
		sc.close();
	}
}
