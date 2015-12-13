import java.util.Scanner;

public class Problem01 {

	// �� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
	// �� 40 ������ � ����� �����.
	// ���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
	// � ����� �����.
	// ������: Abcd Efgh
	// �����: ABCD abcd EFGH efgh

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings with length <= 40 sumbols");
		String word1 = sc.next();
		String word2 = sc.next();
		if (((word1.length()<0)||(word1.length()>40))||((word2.length()<0)||(word2.length()>40))){
			System.out.println("The length of the strings don't meet the requirement!");
		}else{
			System.out.println(word1.toLowerCase()+" ");
			System.out.println(word1.toUpperCase()+" ");
			System.out.println(word2.toLowerCase()+" ");
			System.out.println(word2.toUpperCase());
			
		}
		sc.close();
	}
}
