import java.util.Scanner;

public class Problem07 {
	
//	Да се състави програма, която чете набор от думи разделени с интервал.
//	Като резултат да се извеждат броя на въведените думи, както и броя знаци в най-дългата дума.
//	
//	Пример: asd fg hjkl

//	Изход: 3 думи, най-дългата е с 4 символа.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string of words, with space between them.");
		String text = sc.nextLine();
		int sum = 1;
		int letters = 0;
		int maxLetters = 0;
		for(int i=0;i<text.length();i++){
			if(text.charAt(i)==' '){
				sum+=1;
				letters=0;
			}else{
				letters++;
				if(maxLetters<letters){
					maxLetters=letters;
				}
			}
		}
		System.out.println(sum+"думи"+", най-дългата е с "+maxLetters+"символа");
		sc.close();
	}

}
