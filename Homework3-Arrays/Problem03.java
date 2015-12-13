import java.util.Scanner;

public class Problem03 {

//	Да се въведе число, след което да се създаде масив с 10 елемента по следния начин:
//	Първите 2 елемента на масива са въведеното число. Всеки следващ елемент на масива е равен на сбора от
//	предишните 2 елемента в масива. След това изведете масива.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer number");
		int num = sc.nextInt();
		int [] a = new int [10];
		a[0]=num;
		a[1]=num;
		for(int i =2; i<a.length;i++){
			a[i]=a[i-1]+a[i-2];
		}
		for(int ind=0; ind<a.length; ind++){
			System.out.print(a[ind]+" ");
		}
		sc.close();
	}

}
 