import java.util.Scanner;

public class Problem06 {

	// Напишете програма, която първо чете 2 масива и после извежда съобщение дали са еднакви, 
	// и дали са с еднакъв размер.

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
		if (a.length == b.length) {
			System.out.print("The array A and the array B have the same length");
			for (int index = 0; index < a.length; index++) {
				if (a[index] != b[index]) {
					System.out.println(", but they are not equal!");
					break;
				}
				if (index == a.length-1) {
					System.out.println(" and are equal!");
				}
			
			}
		}else{
			System.out.println("The array A and the array B don't have the same length and they are not equal!");
		}
		sc.close();
	}

}
