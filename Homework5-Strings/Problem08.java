import java.util.Scanner;

public class Problem08 {
	
//	Да се състави програма, чрез която се въвежда ред от символи (стринг, низ). Програмата да изведе на екрана
//	 дали въведения стринг е палиндром, т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
//	
//	Вход: капак
//	Изход: да.
//	Вход: тенджера
//	Изход: не.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string of words, with space between them.");
		String text = sc.nextLine();
		boolean isPalindrom = true;
		for(int i=0, j = text.length()-1; i<text.length() ;i++, j--){
			if(text.charAt(i)!=text.charAt(j)){
				isPalindrom=false;
				break;
			}
		}
		System.out.println("Is the string palindrom: "+isPalindrom);
		sc.close();
	}

}
