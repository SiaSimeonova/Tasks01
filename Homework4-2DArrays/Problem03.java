
public class Problem03 {

	// ����� �������� ����� �� �����, ����� ��������� �� �������� �������������. �� �� ��������� 
	// ������ �� ���������� �� ������, ����� � ������������������� �� ���� �����.

	public static void main(String[] args) {
		int[][] a = { { 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 },
				{ 61, 69, 63, 64, 65 } };
		int sum=0;
		int count=0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				sum+=a[row][col];
				count +=1;
			}
		}
		int avrg = sum/count;
		System.out.println("������ �� ���������� �: "+sum);
		System.out.println("������������������� �� ������� �: "+avrg);
	}
}