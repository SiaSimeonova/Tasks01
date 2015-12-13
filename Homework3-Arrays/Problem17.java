import java.util.Scanner;

public class Problem17 {

	// Една редица от естествени числа ще наричаме зигзагообразна нагоре, ако за елементите и са
	// изпълняват условията: N1 < N2 > N3 < N4 > N5 <..
	// Съставете програма, която проверява дали въведени в едномерен масив  редица от числа
	// изпълняват горните изисквания.
	// Пример: 1 3 2 4 3 7
	// Изход: изпълнява изискванията за зигзагообразна нагоре редица

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете дължината на масива(цяло число > 2).");
		int length = sc.nextInt();
		if(length<3){
			System.out.println("Въведеното число не отговаря на изискването!");
		}
		int [] a = new int [length];
		System.out.println("Моля въведете стойностите в масива.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		boolean isZigZag = true;
		for (int i = 1; i < a.length-1; i++) {
			if (!((a[i] > a[i + 1] && a[i] > a[i - 1]) || (a[i] < a[i + 1] && a[i] < a[i - 1]))) {
				System.out.println("Редицата не е зигзагообразна!");
				isZigZag = false;
				break;
			}
			if (isZigZag && a[0] < a[1]) {
				System.out.println("Редицата изпълнява условията за зигзагообразна нагоре редица!");
				break;
			} else {
				if (isZigZag && a[0] > a[1]) {
					System.out.println("Редицата изпълнява условията за зигзагообразна надолу редица!");
					break;
				}
			}
		}
		sc.close();
	}
}
