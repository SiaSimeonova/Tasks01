import java.util.Scanner;

public class Problem09 {

	// Да се състави програма, чрез която по въведен низ съдържащ букви, цифри, знак минус '-' се извежда сборът
	// на въведените числа като се отчита знакът '-' пред съответното число.
	//
	// Вход: asd-12sdf45-56asdf100
	// Изход:
	// -12
	// 45
	// -56
	// 100
	// Сума = 77

	// VARIANT 1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text.");
		String text = sc.nextLine();
		int number = 0;
		int sum = 0;
		int ten = 1;
		int ifNegative = 1;
		boolean noNumbers = true;
		for (int i = 0; i <= text.length() - 1; i++) {
			if ((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) {
				number = ((number * ten) + ((text.charAt(i) - '0') * ifNegative));
				ten = 10;
				noNumbers = false;
				if (i > 0 && text.charAt(i - 1) == '-') {
					number *= (-1);
					ifNegative = (-1);
				}
				if ((i < text.length() - 1) && ((text.charAt(i + 1) < '0') || (text.charAt(i + 1) > '9'))) {
					System.out.println(number);
					sum += number;
					number = 0;
					ten = 1;
					ifNegative = 1;
				}
				if (i == text.length() - 1) {
					System.out.println(number);
					sum += number;
					number = 0;
					ten = 1;
					ifNegative = 1;
				}
				
			}
		}
		if (noNumbers) {
			System.out.println("There is no numbers in the text!");
		} else {
			System.out.println("Sum: " + sum);
		}
		sc.close();
	}
}

// VARIANT 2

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a text.");
//		String text = sc.nextLine();
//		int number = 0;
//		int sum = 0;
//		int ten = 1;
//		boolean noNumbers = true;
//		for (int i = text.length() - 1; i >= 0; i--) {
//			if ((text.charAt(i) >= '0') && (text.charAt(i) <= '9')) {
//				number += ((text.charAt(i) - '0') * ten);
//				ten = ten * 10;
//				if ((i > 0) && (text.charAt(i - 1) == '-')) {
//					number = number * (-1);
//					System.out.println(number);
//					sum += number;
//					number = 0;
//					ten = 1;
//				}
//				if (i > 0 && (((text.charAt(i - 1) < '0') || (text.charAt(i - 1) > '9'))
//						&& (text.charAt(i - 1) != '-'))) {
//					System.out.println(number);
//					sum += number;
//					number = 0;
//					ten = 1;
//				}
//				if (i == 0) {
//					System.out.println(number);
//					sum += number;
//					number = 0;
//					ten = 1;
//				}
//				noNumbers = false;
//			}
//		}
//		if (noNumbers) {
//			System.out.println("There is no numbers in the text!");
//		} else {
//			System.out.println("Sum: " + sum);
//		}
//		sc.close();
//	}
//}
