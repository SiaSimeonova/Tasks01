import java.util.Scanner;

public class Problem04 {

	// Въведете 2 различни числа от конзолата и ги разпечатайте в
	// нарастващ ред.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two different numbers: A and B");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		if (A == B) {
			System.out.println("The numbers are equal!");
		} else {
			if (A > B) {
				System.out.println(B);
				System.out.println(A);
			} else {
				System.out.println(A);
				System.out.println(B);
			}
		}
		sc.close();
	}
}
