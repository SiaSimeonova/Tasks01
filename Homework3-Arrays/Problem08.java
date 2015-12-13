import java.util.Scanner;

public class Problem08 {

	// Напишете програма, която намира и извежда най-дългата редица от еднакви поредни елементи в даден масив.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете дължината на масива.");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Моля въведете стойностите в масива.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		int prevSum = 0;
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				sum++;
				if (sum > prevSum) {
					prevSum = sum;
					index = i;
				}
			} else {
				sum = 0;
			}
		}
		System.out.print("Най-дългата редица от еднакви поредни елементи е: ");
		while (prevSum >= 0) {
			System.out.print(a[index] + " ");
			prevSum--;
		}
		sc.close();
	}
}
