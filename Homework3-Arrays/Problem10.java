import java.util.Scanner;

public class Problem10 {

	// Да се състави програма, чрез която се въвеждат 7 цели числа в едномерен масив.
	// Програмата да изведе числото, което е най-близко до средната стойност на въведените числа. 
	// Пример: 1,2,3,4,5,6,7
	// Изход: средна стойност 4, най-близка стойност 4

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		int[] a = new int[7];
		System.out.println("Please enter 7 integer numbers.");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		double sum = 0;
		double count = 0;
		double difference = Double.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			count++;
		}
		double avrg = sum / count;
		System.out.println("The middle value of the numbers is: " + avrg);
		double [] substractions = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			double max = (a[i] > avrg) ? a[i] : avrg;
			double min = (a[i] < avrg) ? a[i] : avrg;
			substractions[i] = max - min;
		}
		System.out.println();
		for (int i = 0; i < substractions.length; i++) {
				if (difference>substractions[i]) {
					difference = substractions[i];
					index = i;
			}
		}
		System.out.println("The closest number to the middle value is: " + a[index]);
		sc.close();
	}
}
