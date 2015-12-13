import java.util.Scanner;

public class Problem15 {

	// Да се състави програма, която да изчисли сумата на всички числа от 1 до
	// въведено число N.
	// Използвайте цикъл do-while.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number.");
		int number = sc.nextInt();
		int augent = 1;
		int addent = 2;
		do {
			augent += addent;
			addent++;
		} while (addent <= number);
		System.out.println(augent);
		sc.close();
	}
}
