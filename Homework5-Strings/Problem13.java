
public class Problem13 {

	// Да се създаде метод, който приема два масива от числа и връща масив,
	// съдържащ всички елементи на подадените
	// масиви, като в първата част на масива са елементите на първия подаден
	// масив, а във втората част –
	// тези на втория подаден масив.

	static int[] joinTwoArrays(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int bIndex = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < ((a.length))) {
				c[i] = a[i];
			} else {
				c[i] = b[bIndex];
				bIndex++;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int first[] = { 0,3,3,3,3,5,45 };
		int second[] = new int[] { 0,56,23123,787,78564,3456 };
		int[] third = joinTwoArrays(first, second);
		for (int i = 0; i < third.length; i++) {
			System.out.print(third[i] + " ");
		}
	}
}
