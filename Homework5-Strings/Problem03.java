import java.util.Scanner;

public class Problem03 {
	
//	�� �� ������� ��������, ���� ����� �� �������� �������������� ���
//	������ �� ������� ��� ���������.
//	���������� �� ������� ��������� �� ��������� �� ����������� �� �� �������.

//	������: ���������, ���������
//	�����:
//	����� ���� �� � ����� �������.
//	������� �� �������:
//	8 �-�
//	9 �-�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ��� ����:");
		String word1 = sc.next();
		String word2 = sc.next();
		if(word1.length()==word2.length()){
			System.out.println("����� ���� �� � ������� �������!");
		}else{
			System.out.println("����� ���� �� �� � ������� �������!");
		}
		System.out.println("������� �� �������:");
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
			System.out.println("���� �������� ������� ����� ��������� �� ������� �������!");
		}
		sc.close();
	}
}
