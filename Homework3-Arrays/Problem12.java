import java.util.Scanner;

public class Problem12 {
	
//	Да се състави програма, чрез която по предварително въведени 7 числа в едномерен масив се
//	 разменят местата на елементи с индекси:
	
//	- 0 и 1 чрез трета променлива;
//	- 2 и 3 чрез събиране;
//	- 4 и 5 чрез умножение.
	
//	Пример: 1,2,3,4,5,6,7
//	Изход: 2,1,4,3,6,5,7

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		System.out.println("Please enter seven integer numbers!");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int temp = a[0];
		a[0]=a[1];
		a[1]=temp;
		
		a[2]=a[2]+a[3];
		a[3]=a[2]-a[3];
		a[2]=a[2]-a[3];
		
		a[4]=a[4]*a[5];
		a[5]=a[4]/a[5];
		a[4]=a[4]/a[5];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
