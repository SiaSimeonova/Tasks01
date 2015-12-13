import java.util.Scanner;

public class Problem05 {

	// Да се въведат от потребителя 2 числа. И да се
	// изведат на екрана всички числа от по-малкото до по-голямото.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers.");
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (firstNumber >= secondNumber) {
			while (secondNumber <= firstNumber) {
				System.out.println(secondNumber);
				secondNumber++;
			}
		} else {
			while (firstNumber <= secondNumber) {
				System.out.println(firstNumber);
				firstNumber++;
			}
		}
		sc.close();
	}
}
