import java.util.Scanner;

public class Problem02 {

	// Да се състави програма, чрез която от клавиатурата се въвеждат
	// последователно две думи с дължина 10-20 знака.
	// Програмата да размени първите им 5 знака и да изведе дължината на
	// по-дългата, както и новото им съдържание.
	//
	// Пример: uchilishe uchenik
	// Изход: 9 uchenishe

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two word with length 10-20 symbols.");
		String word1 = sc.next();
		String word2 = sc.next();
		String word1FirstFive = word1.substring(0, 5);
		if (((word1.length() < 0) || (word1.length() > 20)) || ((word2.length() < 0) || (word2.length() > 20))) {
			System.out.println("The length of the strings don't meet the requirement!");
		} else {
			word1 = word2.substring(0, 5).concat(word1.substring(5));
			word2 = word1FirstFive.concat(word2.substring(5));
			String result = (word1.length() > word2.length())?(word1.length()+" "+word1):(word2.length()+" "+word2);
			System.out.println(result);
		}
		sc.close();
	}
}
