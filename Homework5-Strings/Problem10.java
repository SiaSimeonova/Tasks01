import java.util.Scanner;

public class Problem10 {
	
//	�� �� ������� ��������, ����� �� ����� ��� ����� ����, ���������, �� ����� �� �������� ���� 
//	��� ����� ��� �� ������ �� ASCII ��������� � ���������� ������� 5 � � ������� ������������� ������.
//	
//	������ :
//	����: Hello
//	�����: Mjqqt


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
