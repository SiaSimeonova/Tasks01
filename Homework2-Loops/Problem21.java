import java.util.Scanner;

public class Problem21 {
	
//	Дадено е наредено тесте карти. Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, Поп, Асо.
//	Наредбата по цвят на картите е: спатия, каро, купа, пика.Да се създаде програма, чрез която се въвежда N
//	-число от интервала [1..51] и се извеждат въведения номер карта и останалите по-големи карти от тестето.
//	
//	Пример: 47.
//	Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо пика

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number betwin 1 and 51");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("2 spatia");
		case 2:
			System.out.println("2 karo");
		case 3:
			System.out.println("2 kupa");
		case 4:
			System.out.println("2 pika");
			
		case 5:
			System.out.println("3 spatia");
		case 6:
			System.out.println("3 karo");
		case 7:
			System.out.println("3 kupa");
		case 8:
			System.out.println("3 pika");
			
		case 9:
			System.out.println("4 spatia");
		case 10:
			System.out.println("4 karo");
		case 11:
			System.out.println("4 kupa");
		case 12:
			System.out.println("4 pika");
			
		case 13:
			System.out.println("5 spatia");
		case 14:
			System.out.println("5 karo");
		case 15:
			System.out.println("5 kupa");
		case 16:
			System.out.println("5 pika");
			
		case 17:
			System.out.println("6 spatia");
		case 18:
			System.out.println("6 karo");
		case 19:
			System.out.println("6 kupa");
		case 20:
			System.out.println("6 pika");
			
		case 21:
			System.out.println("7 spatia");
		case 22:
			System.out.println("7 karo");
		case 23:
			System.out.println("7 kupa");
		case 24:
			System.out.println("7 pika");
			
		case 25:
			System.out.println("8 spatia");
		case 26:
			System.out.println("8 karo");
		case 27:
			System.out.println("8 kupa");
		case 28:
			System.out.println("8 pika");
			
		case 29:
			System.out.println("9 spatia");
		case 30:
			System.out.println("9 karo");
		case 31:
			System.out.println("9 kupa");
		case 32:
			System.out.println("9 pika");
			
		case 33:
			System.out.println("10 spatia");
		case 34:
			System.out.println("10 karo");
		case 35:
			System.out.println("10 kupa");
		case 36:
			System.out.println("10 pika");
			
		case 37:
			System.out.println("J spatia");
		case 38:
			System.out.println("J karo");
		case 39:
			System.out.println("J kupa");
		case 40:
			System.out.println("J pika");
			
		case 41:
			System.out.println("Q spatia");
		case 42:
			System.out.println("Q karo");
		case 43:
			System.out.println("Q kupa");
		case 44:
			System.out.println("Q pika");
			
		case 45:
			System.out.println("K spatia");
		case 46:
			System.out.println("K karo");
		case 47:
			System.out.println("K kupa");
		case 48:
			System.out.println("K pika");
			
		case 49:
			System.out.println("A spatia");
		case 50:
			System.out.println("A karo");
		case 51:
			System.out.println("A kupa");
		case 52:
			System.out.println("A pika");
			break;
		default:
			System.out.println("The value doesn't meet the requirement!");
			break;
		}
		sc.close();
	}

}
