
public class Problem03 {
	
//	ƒа се изведат на екрана всички нечетни числа от -10 до 10

	public static void main(String[] args) {
		for (int i = -10; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
