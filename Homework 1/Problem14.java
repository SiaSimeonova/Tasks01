import java.util.Scanner;

public class Problem14 {

	// Да се състави програма, която по въведени координати на 2 позиции
	// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
	// различен цвят.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two position in the chess.(four digit, each in a new line)");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		if ((a1 < 1 || a1 > 8) || (a2 < 1 || a2 > 8) || (b1 < 1 || b1 > 8) || (b2 < 1 || b2 > 8)) {
			System.out.println("The numbers don't meet the requirement!");
		} else {
			if (((a1 + a2) % 2 == 0 && (b1 + b2) % 2 == 0) || ((a1 + a2) % 2 != 0 && (b1 + b2) % 2 != 0)) {
				System.out.println(
						a1 + " " + a2 + " " + "and" + " " + b1 + " " + b2 + " - the positions are on the same color.");
			} else {
				System.out.println(
						a1 + " " + a2 + " " + "and" + " " + b1 + " " + b2 + " - the positions are on different color.");
			}
		}
		sc.close();
	}
}
