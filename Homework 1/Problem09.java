import java.util.Scanner;

public class Problem09 {

	// Да се състави програма, която чете от конзолата 2 естествени
	// двуцифрени числа a,b.
	// Програмата да изведе в конзолата дали последната цифра от
	// произведението на двете числа е четна, както и самата цифра.
	// Входни данни: a,b - естествени числа от интервала [10..99].
	// Пример: 15, 25
	// Изход: 375, 5 нечетна

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double-digits integer numbers");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int multiplication = (number1 * number2);
		int lastdigit = multiplication % 10;
		if ((number1 > 100 || number1 < 10) || (number2 > 100 || number2 < 10)) {
			System.out.print("The numbers don't meet the requirement!");
		} else {
			if (lastdigit % 2 == 0) {
				System.out.println(multiplication + ", " + lastdigit + " " + "evan");
			} else {
				System.out.println(multiplication + ", " + lastdigit + " " + "odd");
			}
		}
		sc.close();
	}
}
