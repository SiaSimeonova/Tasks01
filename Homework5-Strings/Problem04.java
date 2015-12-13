import java.util.Scanner;

public class Problem04 {
	
//	Да се състави програма, чрез която по въведени трите имена на двама
//	човека разделени със запетая, се извежда чие име има по-голям сбор
//	от ASCII кодовете на съставящите името букви.
//	Пример: Anna Dosewa Asenowa, Iwo Peew Peew
//	Изход: Anna Dosewa Asenowa

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете пълните имена на двама души, на един ред, разделени със запетя.");
		String text = sc.nextLine();
		int index = 0;
		for(int i =0; i<text.length();i++){
			if(text.charAt(i)==','){
				index =i;
			}
		}
		String name1 = text.substring(0,index);
		String name2 = text.substring(index+2);
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0;i<name1.length();i++){
			sum1 += name1.charAt(i);
		}
		for(int i=0;i<name2.length();i++){
			sum2 += name2.charAt(i);
		}
		String result = (sum1>sum2)?name1:name2;
		System.out.println(result);
		sc.close();
	}
}
