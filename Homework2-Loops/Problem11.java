import java.util.Scanner;

public class Problem11 {

	// Въведете число N чрез конзолата и изкарайте като резултат следния
	// триъгълник с височина N:

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		int num = sc.nextInt();
		{
			for (int step = 0; step < num; step++) {
				for (int empty = 0; empty < num - step; empty++) {
					System.out.print(" ");
				}
				for (int sumbol = 0; sumbol < step * 2 + 1; sumbol++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		sc.close();
	}
}

// Кaто допълнително упражнение – нарисувайте същия триъгълник, но
// незапълнен.

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter an integer number");
// int num = sc.nextInt();
// for (int empty1 = 1; empty1 < num; empty1++) {
// System.out.print(" ");
// }
// System.out.print("*");
// System.out.println();
// if (num > 1) {
// for (int step = 0; step < num - 2; step++) {
// for (int empty2 = 2; empty2 < (num - step); empty2++) {
// System.out.print(" ");
// }
// System.out.print("*");
// for (int empty3 = num - 1; (empty3 < (num + (step * 2))); empty3++) {
// System.out.print(" ");
// }
// System.out.print("*");
// System.out.println();
// }
// for (int last = 1; last < (2 * num); last++) {
// System.out.print("*");
// }
// System.out.println();
// }
//sc.close();
// }
// }
