import java.util.Scanner;

public class Problem18 {

	// Дадени са два едномерни масива с естествени числа. Да се състави програма, която сравнява всички числа с еднакви
	//  индекси от  двата масива и записва в трети масив, по-голямото от двете числа. 
	//Да се изведе съдържанието и на трите масива
	// Пример:
	// 18,19,32,1,3, 4, 5, 6, 7, 8
	// 1, 2, 3,4,5,16,17,18,27,11
	// Изход:
	// 18,19,32 ,4,5,16,17,18,27,11

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array A");
		int lengthA = sc.nextInt();
		int[] a = new int[lengthA];
		System.out.println("Please enter the values in the array A");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Please enter length of the array B");
		int lengthB = sc.nextInt();
		int[] b = new int[lengthB];
		System.out.println("Please enter the values in the array B");
		for (int i = 0; i <= b.length - 1; i++) {
			b[i] = sc.nextInt();
		}
		int lengthC = (lengthA < lengthB) ? lengthA : lengthB;
		int[] c = new int[lengthC];
		for (int i = 0; i <= c.length - 1; i++) {
//			if (a[i] > b[i]) {
//				c[i] = a[i];
//			} else {
//				c[i] = b[i];
//			}
			c[i]=(a[i]>b[i])?a[i]:b[i];
		}
		System.out.print("The numbers in the array A are: ");
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("The numbers in the array B are: ");
		for (int i = 0; i <= b.length - 1; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.print("The numbers in the new array are: ");
		for (int i = 0; i <= c.length - 1; i++) {
			System.out.print(c[i]+" ");
		}
		sc.close();
	}

}
