
public class Problem16 {

	// �� �� ������� ��������, ���� ����� ������������� �������� 10 ������ �����
	// �� ��������� �� ���������� �� ������� �����:
	// 1. ������� �������������� �����.
	// 2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ��� ������
	// �� �������� �� ������� �� + ������� 41.25, � ������ �������� �������� �� 
	// ������� � �������������� ����� ����� ������� � �������� ������� �����
	// 3. �� �� ������� ���������� �� �������� � ��������������� �����.
	// 4. �� �� ������� �������� �������� �� ������ �������� �� ������ ������,
	// ����� �� �������� �� 0.
	//
	// ������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
	// �����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

	public static void main(String[] args) {
		double[] a = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		double count = 0;
		double sum =0;
		System.out.print("�������������� ��������� �� ������ ��: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
		for(int i=0; i<a.length; i++){
			if(a[i]<-0.231){
				a[i]=(i*i)+41.25;
			}else{
				a[i]*=i;
			}
		}
		System.out.println();
		System.out.print("����������� ��������� �� ������ ��: ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+", ");
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=0){
				sum+=a[i];
				count++;
			}
		}
		double avrg = sum/count;
		System.out.println();
		System.out.println("�������� �������� �� ������ �������� �� ������ ������, ����� �� �������� �� ���� �: "+avrg);
	}

}
