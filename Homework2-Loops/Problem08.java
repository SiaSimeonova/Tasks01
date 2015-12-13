import java.util.Scanner;

public class Problem08 {

	// Задача 8: По зададено число n, да се изведе на екрана таблица по
	// следния начин:
	// Пример:
	// Въведете n:
	// 1
	// 0
	//
	// Въведете n:
	// 2
	// 11
	// 33
	//
	// Въведете n:
	// 3
	// 222
	// 444
	// 666

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive integer number.");
		int number = sc.nextInt();
		int z = 1;
		int x = number - 1;
		if (number > 0) {
			while (z < number) {
				x = ((x * 10) + (number - 1));
				z++;
			}
			System.out.println(x);
		} else {
			System.out.println("The number don't meet the requirement!");
		}

		int z2 = 1;
		int multiplier = 2;
		int result = 1;
		if ((number - 1) != 0) {
			while (z2 < number) {
				result = (((x / (number - 1)) * (number - 1)) + (multiplier * (x / (number - 1))));
				System.out.println(result);
				z2++;
				multiplier += 2;
			}
		} else {
			System.out.println();
		}
		sc.close();
	}
}
