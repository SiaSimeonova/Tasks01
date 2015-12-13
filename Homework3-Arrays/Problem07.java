import java.util.Scanner;

public class Problem07 {
	
//	Напишете програма, която първо чете масив и после създава нов масив със същия размер по следния начин:
//	стойността на всеки елемент от втория масив да е равна на сбора от предходния и следващият 
//	елемент на съответния елемент от първия масив. Да се изведе получения масив.
	
	
// Първият и последния елемент съм направила така, както коментирахме на упражнението на 09.11.15 - 
// първия - сбор на втория и последния, последния - сбор на първия и предпоследния.
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length of the array");
		int length = sc.nextInt();
		int[] a = new int[length];
		System.out.println("Please enter the values in the array");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = sc.nextInt();
		}
		int [] b = new int[a.length];
		for(int ind = 1; ind <b.length-1; ind++){
			b[ind] = a[ind-1]+a[ind+1];
		}
		b[0]=a[1]+a[length-1];
		b[length-1]=a[length-2]+a[0];
		for(int ind = 0; ind <b.length; ind++){
			System.out.print(b[ind]+" ");
		}
		sc.close();
	}

}
