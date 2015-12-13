import java.util.Scanner;

public class Problem19 {
	
//	Да се състави програма, чрез която по въведено естествено число от интервала [10..99]
//	се извежда поредица числа, при спазване на следните изисквания:
//	1) ако предходното число е четно се извежда 0.5*числото;
//	2) ако предходното число е нечетно се извежда 3*числото +1.
//	Извеждането продължава докато не се получи стойност 1.
	
	
//	Имах проблем с примера при проверката. При мен дадената поредица от примера се получава, когато
//	въведеното число е 12 (11 е неговото предходното), а не с въведено 11. С 11 както и да го смятам, 
//	не мога да получа поредицата от примера.

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number betwin 10 and 99");
		int a = sc.nextInt();
		int j = (a - 1);
		
		if (a < 10 || a > 99) {
			System.out.println("The number/ doesn't meet the requirement!");
		} else {
			while (j >= 1) {
				if (j == 1) {
					break;
				} else {
					if (j % 2 == 0) { 
						j *= (0.5);
						System.out.println(j);
					} else {
						j = ((j * 3) + 1);
						System.out.println(j);
					}
				}
			}
		}
		sc.close();
	}
}

