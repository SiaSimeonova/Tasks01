import java.util.Scanner;

public class Problem12 {

	// ��������� ������ �� ������ ������ ������ �� 4 � ����������
	// ����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
	// �� 1600 � 2000 �� ���������.
	// ��������� ��������, ����� �� ������ ���, �����, ������ ���������
	// ���������� ����.
	// ������ �����: ��� ����� �� ���, �����, ������.
	// ������: 28, 2, 2000
	// �����: 1,3,2000

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date (from 1-st to 31-st)");
		int date = sc.nextInt();
		System.out.println("Enter a month");
		int month = sc.nextInt();
		System.out.println("Enter a year");
		int year = sc.nextInt();
		if ((date > 30) && (month == 4 || month == 6 || month == 9 || month == 11) || (date > 30)
				&& (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12))
			System.out.println("The data is not correct!");
		if (date < 28) {
			System.out.println("Next date is: " + (1 + date) + "." + month + "." + year);
		} else {

			if ((date > 27 && date < 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
				System.out.println("Next date is: " + (date + 1) + "." + month + "." + year);
			}
			if ((date == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
				System.out.println("Next date is: " + 1 + "." + (month + 1) + "." + year);
			}
			if ((date > 27 && date < 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
					|| month == 10 || month == 12)) {
				System.out.println("Next date is: " + (1 + date) + "." + month + "." + year);
			}
			if (date == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
				System.out.println("Next date is: " + 1 + "." + (month + 1) + "." + year);
			}
			if (date == 31 && month == 12) {
				System.out.println("Next date is: " + 1 + "." + 1 + "." + (year + 1));
			}
			if (date == 28 && month == 2 && (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("Next date is: " + (1 + date) + "." + month + "." + year);
			}
			if (date == 28 && month == 2 && year % 4 != 0 && year % 100 != 0) {
				System.out.println("Next date is: " + 1 + "." + (month + 1) + "." + year);
			}
			if (date == 28 && month == 2 && (year % 100 == 0 && year % 400 == 0)) {
				System.out.println("Next date is: " + (1 + date) + "." + month + "." + year);
			}
			if (date == 28 && month == 2 && (year % 100 == 0 && year % 400 != 0)) {
				System.out.println("Next date is: " + 1 + "." + (month + 1) + "." + year);
			}
		}
		sc.close();
	}
}
