import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
//		Нека по въведен масив да се конструира нов, като половината му елементи са точно като на оригиналния,
//		а другите да са тези елементи, но в обратен ред. Последно, да се изведе новия масив на екрана.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length = sc.nextInt();
		int [] a = new int [length];
		System.out.println("Please enter the values in the array");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int [] newArray = new int [a.length];
		for (int i = 0; i<(a.length/2); i++){
			newArray[i] = a[i];
		}
		int q = 1;
		for (int i = (a.length/2); i<a.length; i++){
			newArray[i] = a[a.length-q];
			q++;
		}
		System.out.println("The values in the new array are:");
		for (int i = 0; i<newArray.length; i++){
			System.out.print(newArray[i]+" ");;
		}
		sc.close();
	}

}
