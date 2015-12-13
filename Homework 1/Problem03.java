import java.util.Scanner;

public class Problem03 {
	
//	Въведете 2 различни числа от конзолата и разменете стойността им.
//	Разпечатайте новите стойности

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two different numbers: A and B.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a == b) {
			System.out.println("The numbers are equal!");
		} else {
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("New value of A is: " + a);
			System.out.println("New value of B is: " + b);
		}
		sc.close();
	}
}