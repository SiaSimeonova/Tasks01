import java.util.Scanner;

public class Problem18 {
	
//	Да се състави програма, чрез която се въвежда две числа от интервала [1..9]. Програмата да извежда 
//	таблицата за умножение. Максималната стойност на множителите е определена от 2-те числа.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two positive integer number betwin 1 and 9");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a == 0 || a > 9) || (b == 0 || b > 9)) {
			System.out.println("The number/s do/es not meet the requirement!");
		} else {
			for (int x = 1; x <= a; x++) {
				for (int y = 1; y <= b; y++) {
					System.out.println(x + "*" + y + "=" + (x * y));
				}
			}
		}
		sc.close();
	}

}
