import java.util.Scanner;

public class Problem09 {

	// Напишете програма, в която потребителя въвежда масив, след което елементите на масива се обръщат
	// в обратен ред (Целта не е масива да се отпечата в обратен ред, ами първо да се обърне, след което
	//  да се отпечата в нормален ред).
	// Пробвайте да решите задачата първо с един допълнителен масив и после без да използвате друг масив.
	//

	public static void main(String[] args) {

		// Първо решение - с допълнителен масив

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Please enter length of the array");
		// int length = sc.nextInt();
		// int[] a = new int[length];
		// System.out.println("Please enter the values in the array");
		// for (int i = 0; i <= a.length - 1; i++) {
		// a[i] = sc.nextInt();
		// }
		// int [] b = new int[a.length];
		// for(int ind = 0; ind <length; ind++){
		// b[ind] = a[length-1-ind];
		// }
		// for(int ind = 0; ind <length; ind++){
		// a[ind] = b[ind];
		// System.out.print(a[ind]+" ");
		// }
		// }
		//
		// }

		// Второ решение - без допълнителен масив

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Please enter the values in the array");

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		if (length % 2 != 0) {
			for (int i = 0; i < (a.length - 1) / 2; i++) {
				a[i] = a[length - 1 - i] + a[i];
			}
			for (int i = a.length - 1; i > a.length / 2; i--) {
				a[i] = (a[i] - a[length - 1 - i]) * (-1);
			}
			for (int i = 0; i < (a.length - 1) / 2; i++) {
				a[i] = a[i] - a[length - 1 - i];
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		} else {
			for (int i = 0; i < (a.length) / 2; i++) {
				a[i] = a[length - 1 - i] + a[i];
			}
			for (int i = a.length - 1; i >= a.length / 2; i--) {
				a[i] = (a[i] - a[length - 1 - i]) * (-1);
			}
			for (int i = 0; i < (a.length) / 2; i++) {
				a[i] = a[i] - a[length - 1 - i];
			}
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		sc.close();
	}
}
