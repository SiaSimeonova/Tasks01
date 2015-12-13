import java.util.Scanner;

public class Problem15 {

	// Да се състави програма, която въвежда в едномерен масив реални числа.
	// Като изход: програма извежда онези 3 различни числа, чиято абсолютна
	// стойност формира максималната обща сума.
	// Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
	// Изход: 5.1; 6.34; 7.13

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array (number > 3)");
		int length = sc.nextInt();
		if (length < 3) {
			System.out.println("The number don't meet the requirement!");
		}
		double[] a = new double[length];
		System.out.println("Please enter the values in the array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextDouble();
		}
		double maxNumber1 = 0;
		double maxNumber2 = 0;
		double maxNumber3 = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]<0){
					a[i]*=(-1);
				}
				if (a[i] > maxNumber1) {
					maxNumber1 = a[i];
				}
			}
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0){
				a[i]*=(-1);
			}
			if (a[i] > maxNumber2 && a[i] != maxNumber1) {
				maxNumber2 = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0){
				a[i]*=(-1);
			}
			if (a[i] > maxNumber3 && a[i] != maxNumber1 && a[i] != maxNumber2) {
				maxNumber3 = a[i];
			}
		}
		System.out.print("The numbers with grater sum are: " + maxNumber1 + "; " + maxNumber2 + "; " + maxNumber3);
		sc.close();
	}
}
