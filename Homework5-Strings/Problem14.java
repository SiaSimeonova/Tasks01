
public class Problem14 {

	// �� �� ������� �����, ����� ������ �� �������� ����� N � ����� ����������
	// �� N! (N ���������).

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int num = 15;
		int factorial = factorial(num);
		System.out.println(factorial);
	}

}
