import java.util.Scanner;

public class Problem10 {
	
//	Да се състави програма, която по даден низ връща друг, символите, на който са получени като 
//	към всеки код на символ от ASCII таблицата е добавеното числото 5 и е записан новополучения символ.
//	
//	Пример :
//	Вход: Hello
//	Изход: Mjqqt


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a strings ");
		String word = sc.nextLine();
		char [] qs = new char [word.length()];
		for(int i=0;i<qs.length;i++){
			qs[i]=word.charAt(i);
		}
		for(int i=0;i<qs.length;i++){
			qs[i]+=5;
			System.out.print(qs[i]);
		}
		sc.close();
	}
}
