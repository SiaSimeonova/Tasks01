
public class Problem07 {
	
//	����� ������������� �������� ��������� �� ���������� �����, �������� � ��������� ������� � ������� 6 ���� � 6 ������.
//	�� �� ������� ��������, ���� ����� �� ������ ������ �� ������ ��������, ����� ���� �� ������� �� ��� � ������ � 
//	����� �����. ���������� �� ������� ����������� ���� �� ����� ������� ��� �� ����������� �������, ����� � ������
//	���� �� ���� ��������. �� �� �������� ���� ���� �����.
//	11,12,13,14,15,16,
//	21,22,23,24,25,26,
//	31,32,33,34,35,36,
//	41,42,43,44,45,46,
//	51,52,53,54,55,56,
//	61,62,63,64,65,66
//	�����:
//	11, ,13, ,15, , ���� �� ���������� �� ����: 39
//	22, ,24, ,26, ���� �� ���������� �� ����: 72
//	31, ,33, ,35, , ���� �� ���������� �� ����: 99
//	42, ,44, ,46, ���� �� ���������� �� ����: 132
//	51, ,53, ,55, , ���� �� ���������� �� ����: 159
//	62, ,64, ,66 ���� �� ���������� �� ����: 192
//	���� �� ����������: 693

	public static void main(String[] args) {
		int[][] a = { { 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 },
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 } };
		int sumR = 0;
		int sumAll = 0;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				if((c+r)%2==0){
					System.out.print(a[r][c]+", ");
					sumR+=a[r][c];
					if((c == (a[0].length-1))||(c == (a[0].length-2))){
						System.out.println("���� �� �������� �� ����: "+sumR);
						sumAll+=sumR;
						sumR=0;
					}
				}
			}
		}
		System.out.println("���� �� ����������: "+sumAll);
	}

}
