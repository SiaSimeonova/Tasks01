import java.util.Scanner;

public class Problem10 {

	// Въведете число от клавиатурата и определете дали е просто.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an positive integer number");
		int num = sc.nextInt();
		boolean isPrime = true;
		if (num == 1) {
			System.out.println("The number is not prime.");
			isPrime = false;
		} else {
			if (num == 2) {
				System.out.println("The number is prime.");
				isPrime = false;
			} else {
				for (int step = 2; step < num; step++) {
					if (num % step == 0) {
						System.out.println("The number is not prime.");
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime == true) {
				System.out.println("The number is prime.");
			}
		}
		sc.close();
	}
}
