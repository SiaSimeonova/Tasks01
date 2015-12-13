import java.util.Scanner;

public class Problem04 {

	// Да се прочете масив и да се отпечата дали е огледален.
	// Следните масиви са огледални:
	// [3 7 7 3]
	// [4]
	// [1 55 1]
	// [6 27 -1 5 7 7 5 -1 27 6]

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете дължината на масива.");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Моля въведете стойностите в масива.");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		boolean ogledalenLiE = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				System.out.println("Въведения масив не е огледален!");
				ogledalenLiE = false;
				break;
			}
		}
		if (ogledalenLiE) {
			System.out.println("Въведения масив е огледален!");
		}
		sc.close();
	}
}

