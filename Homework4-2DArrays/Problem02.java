import java.util.Scanner;

public class Problem02 {

	// Имате квадратен двумерен масив от естествени числа, чийто стойности се въвеждат.
	// Да се отпечатат диагоналите на масива.

	// Пример:
	// 1,4,6,3
	// 5,9,7,2
	// 4,8,1,9
	// 2,3,4,5
	// Изход:
	// 1 9 1 5
	// 3 7 8 2

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of the rows (number > 1)");
		int rows = sc.nextInt();
		System.out.println("Please enter the number of the cols (number > 1)");
		int cols = sc.nextInt();
		int[][] a = new int[rows][cols];
		System.out.println("Please enter the numbers in the array, starting with the numbers in row 1");
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				a[r][c] = sc.nextInt();
			}
		}
		int r1 = 0;
		int c1 = 0;
		while (r1 < a.length && c1 < a[0].length) {
			System.out.print(a[r1][c1]+" ");
			r1++;
			c1++;
		}
		System.out.println();
		int r2 = 0;
		int c2 = a[0].length-1;
		while (r2 <= a.length-1 && c2 >= 0) {
			System.out.print(a[r2][c2]+" ");
			r2++;
			c2--;
		}
		System.out.println();
		sc.close();
	}
}
