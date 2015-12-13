import java.util.Scanner;

public class Problem17 {

	// Да се състави програма, която извежда квадрат, чийто страни са оформени
	// със знака *,
	// а вътрешността е запълнена със въведен знак.
	// Входни данни b - дължина на страната число от интервала [3..20],
	// c - желан знак.
	//	Програмата да използва цикъл for.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number betwin 3 and 20.");
		int b = sc.nextInt();
		System.out.println("Enter a sumbol");
		char c = sc.next().charAt(0);
		
		if (b > 20 || b < 3) {
			System.out.println("The number don't meet the requirement!");
		} else {
			for (int a = 0; a < b; a++) {
				System.out.print("*");
			}
			System.out.println();
			for (int e = 1; e < (b - 1); e++) {
				for (int f = 0; f < 1; f++) {
					System.out.print("*");
				}
				for (int j = 1; j < (b - 1); j++) {
					System.out.print(c);
				}
				for (int h = (b - 1); h < b; h++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int i = 0; i < b; i++) {
				System.out.print("*");
			}
		}
		sc.close();
	}
}
