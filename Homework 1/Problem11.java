import java.util.Scanner;

public class Problem11 {

	// Ñúñòàâåòå ïğîãğàìà, êîÿòî ïî äàäåíî òğèöèôğåío ÷èñëî ïğîâåğÿâà
	// äàëè ÷èñëîòî ñå äåëè íà âñÿêà ñâîÿ öèôğà. Âúâ âúâåäåíîòî ÷èñëî äà
	// íÿìà öèôğà 0.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a three-digit integer number, the digits must be different from zero.");
		int number = sc.nextInt();
		int firstDigit = ((number % 1000) / 100);
		int secondDigit = ((number % 100) / 10);
		int thirdDigit = (number % 10);
		if ((number > 999) || (number < 100)) {
			System.out.println("The number doesn't meet the requirement!");
		} else {
			if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
				System.out.println("The number doesn't meet the requirement!");
			} else {
				System.out.println(number + " / " + firstDigit + " = " + (number / firstDigit) + "("
						+ number % firstDigit + " - remainder)");
				System.out.println(number + " / " + secondDigit + " = " + (number / secondDigit) + "("
						+ number % secondDigit + " - remainder)");
				System.out.println(number + " / " + thirdDigit + " = " + (number / thirdDigit) + "("
						+ number % thirdDigit + " - remainder)");
			}
		}
		sc.close();
	}
}
