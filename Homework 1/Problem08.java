import java.util.Scanner;

public class Problem08 extends Problem01 {

	// Да се състави програма, която чете от конзолата 4-цифренo
	// естествено число от интервала [1000.. 9999]. От това число се
	// формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
	// и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
	// 3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
	// ново число e по-малко <, равно = или по-голямо от 2-то число.
	// Пример: 3332 Изход: по-малко (32<33)
	// Пример: 1144 Изход: равни (14=14)
	// Пример: 9875 Изход: по-голямо (95>87)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number betwin 1000 and 9999");
		int a = sc.nextInt();
		int n4 = a % 10;
		int n3 = ((a % 100) / 10);
		int n2 = ((a % 1000) / 100);
		int n1 = ((a % 10000) / 1000);
		int new1 = ((n1 * 10) + n4);
		int new2 = ((n2 * 10) + n3);
		if (a > 9999 || a < 1000) {
			System.out.print("The number doesn't meet the requirement!");
		} else {
			if (new1 > new2) {
				System.out.println("biger: " + new1 + ">" + new2);
			}
			if (new1 < new2) {
				System.out.println("smaller: " + new1 + "<" + new2);
			}
			if (new1 == new2) {
				System.out.println("equal: " + new1 + "=" + new2);
			}
		}
		sc.close();
	}
}
