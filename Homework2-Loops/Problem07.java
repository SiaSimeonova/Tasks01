import java.util.Scanner;

public class Problem07 {

	// ���������� �� 3, �� �� ������� �� ������ ������� n
	// ����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number.");
		int number = sc.nextInt();
		int three = 3;
		int subtrahend = 1;
		while (subtrahend <= number) {
			int product = three * subtrahend;
			subtrahend++;
			if (product == 3) {
				System.out.print(product);
			} else {
				System.out.print(", " + product);
			}
		}
		sc.close();
	}
}
