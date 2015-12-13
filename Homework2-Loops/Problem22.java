import java.util.Scanner;

public class Problem22 {
	
//	Да се състави програма, която извежда първите 10 най-малки числа, които се делят на 2, 3 или на 5
//	и които са по-големи от въведено естествено число.Числата се извеждат, заедно с техния пореден номер.
//	Входни данни: число от интервала [1..999]
	
//	Пример: 1
//	Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
	
//	Използвайте цикъл while.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number (from 1 to 9999.)");
		int i = sc.nextInt();
		int j = (i+1);
		int step = 1;
		
		if (i > 9999 || i < 1) {
			System.out.println("The number doesn't meet the requirement!");
		} else {
			while (step <= 10) {
				if (j % 2 == 0 || j % 3 == 0 || j % 5 == 0) {
					if(step<10){
					System.out.print(step + ":" + j + ", ");
					step++;
					j++;
					}else{
						System.out.print(step + ":" + j);
						step++;
						j++;
					}

				} else {
					j++;
					continue;
				}
			}
		}
		sc.close();
	}
}
