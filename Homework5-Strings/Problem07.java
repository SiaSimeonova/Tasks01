import java.util.Scanner;

public class Problem07 {
	
//	�� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������.
//	���� �������� �� �� �������� ���� �� ���������� ����, ����� � ���� ����� � ���-������� ����.
//	
//	������: asd fg hjkl

//	�����: 3 ����, ���-������� � � 4 �������.

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
		System.out.println(sum+"����"+", ���-������� � � "+maxLetters+"�������");
		sc.close();
	}

}
