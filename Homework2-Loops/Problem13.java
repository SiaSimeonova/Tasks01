import java.util.Scanner;

public class Problem13 {

	// Да се състави програма, която извежда всички естествени трицифрени числа,
	// които имат сбор на цифрите равен на дадено число.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive integer number betwin 2 and 27");
		int num = sc.nextInt();

		if (num > 27 ^ num < 2) {
			System.out.println("The number don't meet the requirement!");
		} else {
			for (int i = 100; i < 1000; i++) {
				int a = i % 10;
				int b = (i / 10) % 10;
				int c = i / 100;
				if (num == (a + b + c)) {
					System.out.println(i);
				} else {
					continue;
				}
			}
		}
		sc.close();
	}
}
