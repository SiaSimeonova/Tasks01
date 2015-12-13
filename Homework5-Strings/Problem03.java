import java.util.Scanner;

public class Problem03 {
	
//	Да се състави програма, чрез която се въвеждат последователно две
//	редици от символи без интервали.
//	Програмата да извежда съобщение за резултата от сравнението им по позиции.

//	Пример: хипопотам, хипопотук
//	Изход:
//	Двата низа са с равна дължина.
//	Разлика по позиции:
//	8 а-у
//	9 м-к

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете два низа:");
		String word1 = sc.next();
		String word2 = sc.next();
		if(word1.length()==word2.length()){
			System.out.println("Двата низа са с еднаква дължина!");
		}else{
			System.out.println("Двата низа не са с еднаква дължина!");
		}
		System.out.println("Разлика по позиции:");
		boolean equal = true;
		for(int i=0; i<word1.length(); i++){
			if(word1.charAt(i)!=word2.charAt(i)){
				char sign1 = word1.charAt(i);
				char sign2 = word2.charAt(i);
				int index = i;
				System.out.println((index+1)+" "+sign1+" "+sign2);
				equal = false;
			}
		}
		if(equal){
			System.out.println("Няма намерени разлики между символите на еднакви позиции!");
		}
		sc.close();
	}
}
