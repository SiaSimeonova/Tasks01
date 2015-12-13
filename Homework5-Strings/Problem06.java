import java.util.Scanner;

public class Problem06 {

	// Да се състави програма, чрез която се въвежда изречение с отделни думи. Като резултат на екрана
	//  да се извежда същия текст, но всяка отделна дума да започва с главна буква, а следващите я букви да са малки.
	// 
	// Пример: супер яката задача
	// Изход: Супер Яката Задача

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a strings ");
		String a = sc.nextLine();
		a=a.toLowerCase();
		a = a.substring(0, 1).toUpperCase() + a.substring(1);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				int index = i;
				a = a.substring(0, index + 1) + a.substring(index + 1, index + 2).toUpperCase()
						+ a.substring(index + 2);
			}
		}
		System.out.println(a);
		sc.close();
	}
}
