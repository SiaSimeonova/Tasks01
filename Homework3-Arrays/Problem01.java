import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
//		Да се прочете масив и да се намери най-малкото число кратно на
//		3 от масива.		
//		10, 3, 5, 8, 6, -3, 7
//		Най-малкото число кратно на 3 е -3
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Моля въведете дължината на масива.");
		int length = sc.nextInt();
		int [] a = new int [length];
		System.out.println("Моля въведете стойностите в масива.");
		for(int i=0;i<=a.length-1;i++){
			a[i]=sc.nextInt();
		}
		int min = a[0];
		for(int i=0; i<=a.length-1;i++){
			if(a[i]%3==0){
				if(min>a[i]){
					min=a[i];
				}
			}
		}
		System.out.println("Най-малкото число, кратно на три е: "+min);
		sc.close();
	}
}
