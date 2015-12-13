import java.util.Scanner;

public class Problem16 {

	// Въведено е трицифрено естествено число от вида abc.
	// Трябва да се провери дали:
	// ако a = b = c - Изход: цифрите са равни;
	// ако a>b>c - Изход: цифрите са във възходящ ред;
	// ако a<b<c цифрите са в низходящ ред;
	// и изход: цифрите са ненаредени, за неописаните случаи.
	// Да се състави програма, която извежда резултата от проверката за
	// наредба на цифрите в числото.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit integer number");
		int number = sc.nextInt();
		int firstDigit = (number / 100);
		int secondDigit = ((number / 10) % 10);
		int thirdDigit = (number % 10);
		boolean notOrdered = true;
		if ((number > 999) || (number < 100)) {
			System.out.println("The number doesn't meet the requirement!");
		} else {
			if (firstDigit == secondDigit && secondDigit == thirdDigit) {
				System.out.println("All digits are equal!");
				notOrdered = false;
			}
			if (firstDigit > secondDigit && secondDigit > thirdDigit) {
				System.out.println("The digits are descending!");
				notOrdered = false;
			}
			if (firstDigit < secondDigit && secondDigit < thirdDigit) {
				System.out.println("The digits are ascending!");
				notOrdered = false;
			}
			if (notOrdered) {
				System.out.println("The digits are misplased!");
			}
		}
		sc.close();
	}
}
