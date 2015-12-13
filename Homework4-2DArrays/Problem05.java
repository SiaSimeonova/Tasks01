
public class Problem05 {

	// �� �� ������� ��������, ��� ����� ������������� �� �������� ���������� ����� � �������� ����� 4*4 ��������.
	// ���������� �� ������� �������� �� ���������� ����� � ������������� �� ���-�������� ���� �� ������ ������ 
	// ���-�������� ���� �� ������.
	// ������:
	// 1,2,3,4
	// 5,6,7,8
	// 9,10,11,12
	// 13,14,15,16
	// �����:
	// ���-������ ���� �� ������ 58
	// ���-������ ���� �� ������ 40
	// ������������ ���� �� ������ � > �� ������������ ���� �� ������
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }, };
		int maxR = 0;
		int maxC = 0;
		int cTemp = maxC;
		int rTemp = maxR;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				maxR += a[r][c];
			}
			if (maxR > rTemp) {
				rTemp = maxR;
				maxR = 0;
			} else {
				maxR = 0;
			}
		}
		System.out.println("���-�������� ���� �� ������ �: " + rTemp);

		for (int c = 0; c < a.length; c++) {
			for (int r = 0; r < a[0].length; r++) {
				maxC += a[r][c];
			}
			if (maxC > cTemp) {
				cTemp = maxC;
				maxC = 0;
			} else {
				maxC = 0;
			}
		}
		System.out.println("���-�������� ���� �� ������ �: " + cTemp);
		String ch = (rTemp > cTemp) ? ">" : "<";
		System.out.println("���-�������� ���� �� ������ � " + ch + " �� ���-�������� ���� �� ������.");
	}

}
