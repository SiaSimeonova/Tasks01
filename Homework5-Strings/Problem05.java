
import java.util.Scanner;

public class Problem05 {

	// Да се състави програма, чрез която се въвеждат 2 редици от знаци (думи).
	// Ако в двете редици участва един и същи знак, да се изведе на екрана първата редица хоризонтално, 
	// а втората вертикално, така че да се пресичат в общия си знак.
	// Ако редиците нямат общ знак да се изведе само уведомително съобщение.
	// Пример :

	// м
	// а
	// шапка
	// и
	// н
	// а

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете две думи.");
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		int positionInWord1 = 0;
		int positionInWord2 = 0;
		boolean noLetter = true;
		boolean stop = false;
		for (int i = 0; i < name2.length(); i++) {
			if (stop) {
				break;
			} else {
				for (int j = 0; j < name1.length(); j++) {
					if (name2.charAt(i) == name1.charAt(j)) {
						positionInWord1 = j;
						positionInWord2 = i;
						noLetter = false;
						stop = true;
						break;
					}
				}
			}
		}
		if (noLetter) {
			System.out.println("Въведените думи нямат общи букви!");
		} else {
			for (int i = 0; i < name1.length(); i++) {
				if (i == positionInWord1) {
					System.out.println(name2);
				} else {
					for (int j = 0; j < positionInWord2; j++) {
						System.out.print(" ");
					}
					System.out.println(name1.charAt(i));
				}
			}
		}
		sc.close();
	}
}