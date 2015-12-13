import java.util.Scanner;

public class Problem09 {

	// Да се прочетат 2 числа от клавиатурата А и В.
	// Да се изведат всички числа от А до В на степен 2 (разделени с запетая).
	// Ако някое число е кратно на 3, да се изведе съобщение че числото се
	// пропуска „skip 3“.
	// Ако сумата от всички изведени числа (без пропуснатите) стане по-голяма от
	// 200, да се прекрати извеждането.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int step = 0;
		int count200 = 0;
		if ((a + step) <= b) {
			while (a + step <= b) {
				int sum = a + step;
				if ((a + step) % 3 == 0) {
					System.out.print("skip3" + ", ");
				} else {
					count200 += (sum * sum);
					if (count200 >= 200) {
						break;
					} else {
						System.out.print(sum * sum + ", ");
					}
				}
				step++;
			}
		} else {
			while (b + step <= a) {
				int sum = b + step;
				if ((b + step) % 3 == 0) {
					System.out.print("skip3" + ",");
				} else {
					count200 += (sum * sum);
					if (count200 >= 200) {
						break;
					} else {
						System.out.print(sum * sum + ",");
					}
				}
				step++;
			}
		}
		sc.close();
	}
}
