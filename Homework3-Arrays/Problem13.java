import java.util.Scanner;

public class Problem13 {
	
//	Да се състави програма,чрез която се въвежда число и се представя като число в двоична бройна система
//	Програмата, чрез масив, да изчислява последователно всички цифри на въведеното естествено число в
//  2-ична бройна система.
//	Пример: 99
//	Изход: 1100011

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer number!");
		int num = sc.nextInt();
		int duplicateNum=num;
		int length =0;
		while(duplicateNum>=1){
			duplicateNum/=2;
			length++;
		}
		int [] a = new int [length];
		for(int i=0;i<=a.length-1;i++){
			a[i]=num%2;
			num/=2;
		}
		for(int i=length-1;i>=0;i--){
			System.out.print(a[i]);
		}
		sc.close();
	}
}
