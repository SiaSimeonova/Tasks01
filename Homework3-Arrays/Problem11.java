import java.util.Scanner;

public class Problem11 {

	// Да се състави програма, която въвежда от клавиатурата 7 цели числа в едномерен масив
	// Програмата да изведе всички числа кратни на 5, но по големи от 5.
	// Пример: -23, -55, 17, 75, 56, 105, 134
	// Изход: 75,105 2 числа

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		System.out.println("Моля въведете седем цели числа.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum =0;
		System.out.print("Числата, по-големи и кратни на 5 са: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 5 && a[i] % 5 == 0) {
				System.out.print(a[i] + ", ");
				sum++;
				}
			if(i==a.length-1){
				System.out.println(sum+" числа");
			}
		}
		sc.close();
	}

}
