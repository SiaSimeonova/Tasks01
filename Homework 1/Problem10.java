import java.util.Scanner;

public class Problem10 {

	// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	// 3 литра и ги ползвате едновременно.
	// Да се състави програма, която по даден обем извежда как ще прелеете
	// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	// кофите. Кофите не могат да се ползват с частично количество вода.
	// Входни данни: естествено число от интервала [10..9999].
	// Пример: 107
	// Изход: 21 пъти по 2 литра,
	// 21 пъти по 3 литра
	// допълнително кофа от 2 литра

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number betwin 10 and 9999.");
		int water = sc.nextInt();
		int result = water % 5;
		if (water > 9999 || water < 10) {
			System.out.print("The number doesn't meet the requirement!");
		} else {
			if (result == 0) {
				System.out.print((water / 5) + " times x 2 liters and " + (water / 5) + " times x 3 liters.");
			} else {
				if (result == 4) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " two times x 2 liters");
				}
				if (result == 3) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " one times x 3 liters");
				}
				if (result > 3) {
					System.out.print((water / 5) + " times x 2 liters, " + (water / 5) + " times x 3 liters " + "and "
							+ " one times x 2 liters");
				}
			}
		}
		sc.close();
	}
}