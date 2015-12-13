import java.util.Scanner;

public class Problem05 {

	// Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
	// ред.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three different numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		if ((a == b) || (b == c) || (b == c)) {
			System.out.println("The numbers don't meet the requirement!");
		} else {
			if (a > b && a > c) {
				System.out.print(a);
				if (b > c) {
					System.out.print(" > " + b + " > " + c);
				} else {
					System.out.print(" > " + c + " > " + b);
				}
			}
			if (b > a && b > c) {
				System.out.print(b);
				if (a > c) {
					System.out.print(" > " + a + " > " + c);
				} else {
					System.out.print(" > " + c + " > " + a);
				}
			}
			if (c > b && c > b) {
				System.out.print(c);
				if (b > a) {
					System.out.print(" > " + b + " > " + a);
				} else {
					System.out.print(" > " + a + " > " + b);
				}
			}

		}
		sc.close();
	}
}
