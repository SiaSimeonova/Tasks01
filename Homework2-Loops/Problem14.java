import java.util.Scanner;

public class Problem14 {

	// Да се състави програма, която по въведено естествено число N от интервала
	// [10..200]
	// извежда в обратен ред всички числа, които са кратни на 7 и са по-малки от
	// N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive integer number betwin 10 and 200");
		int num = sc.nextInt();
		if (num > 200 || num < 10) {
			System.out.println("The number don't meet the requirement!");
		} else {
			for (int i = num - 1; i > 6; i--) {
				if (i % 7 == 0) {
					System.out.println(i);
				} else {
					continue;
				}
			}
		}
		sc.close();
	}
}
